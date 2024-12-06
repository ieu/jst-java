package io.github.ieu.jst.auth.caffeine;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.Expiry;
import io.github.ieu.jst.auth.JstTokenStore;
import org.checkerframework.checker.index.qual.NonNegative;

import java.time.Duration;
import java.util.Optional;

public class CaffeineJstTokenStore implements JstTokenStore {
    private final Cache<String, String> cache = Caffeine.newBuilder()
            .expireAfter(new Expiry<String, String>() {
                @Override
                public long expireAfterCreate(String key, String value, long currentTime) {
                    return Long.MAX_VALUE;
                }

                @Override
                public long expireAfterUpdate(String key, String value, long currentTime, @NonNegative long currentDuration) {
                    return currentTime;
                }

                @Override
                public long expireAfterRead(String key, String value, long currentTime, @NonNegative long currentDuration) {
                    return currentTime;
                }
            })
            .build();

    @Override
    public Optional<String> getAccessToken(String appKey) {
        return Optional.ofNullable(cache.getIfPresent(buildAccessTokenCacheKey(appKey)));
    }

    @Override
    public void setAccessToken(String appKey, String accessToken, Duration expiresIn) {
        cache.policy()
                .expireVariably()
                .ifPresent(e -> {
                    e.put(buildAccessTokenCacheKey(appKey), accessToken, expiresIn);
                });
    }

    private String buildAccessTokenCacheKey(String appKey) {
        return String.format("jst:%s:access_token", appKey);
    }

    @Override
    public Optional<String> getRefreshToken(String appKey) {
        return Optional.ofNullable(cache.getIfPresent(buildRefreshTokenCacheKey(appKey)));
    }

    @Override
    public void setRefreshToken(String appKey, String refreshToken, Duration expiresIn) {
        cache.policy()
                .expireVariably()
                .ifPresent(e -> {
                    e.put(buildRefreshTokenCacheKey(appKey), refreshToken, expiresIn);
                });
    }

    private String buildRefreshTokenCacheKey(String appKey) {
        return String.format("jst:%s:refresh_token", appKey);
    }
}
