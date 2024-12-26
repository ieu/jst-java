package io.github.ieu.jst.auth.caffeine;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.Expiry;
import io.github.ieu.jst.auth.AbstractCachingJstTokenStore;
import io.github.ieu.jst.auth.JstTokenStore;

import java.time.Duration;
import java.util.Optional;

public class CaffeineJstTokenStore extends AbstractCachingJstTokenStore implements JstTokenStore {

    private final Cache<String, String> cache = Caffeine.newBuilder()
            .expireAfter(new Expiry<String, String>() {
                @Override
                public long expireAfterCreate(String key, String value, long currentTime) {
                    return Long.MAX_VALUE;
                }

                @Override
                public long expireAfterUpdate(String key, String value, long currentTime, long currentDuration) {
                    return currentTime;
                }

                @Override
                public long expireAfterRead(String key, String value, long currentTime, long currentDuration) {
                    return currentTime;
                }
            })
            .build();

    @Override
    protected Optional<String> getCacheValue(String cacheKey) {
        return Optional.ofNullable(cache.getIfPresent(cacheKey));
    }

    @Override
    protected void setCache(String cacheKey, String cacheValue, Duration expiresIn) {
        cache.policy()
                .expireVariably()
                .ifPresent(e -> {
                    e.put(cacheKey, cacheValue, expiresIn);
                });
    }
}
