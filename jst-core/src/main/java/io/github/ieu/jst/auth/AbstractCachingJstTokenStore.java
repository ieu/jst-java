package io.github.ieu.jst.auth;

import java.time.Duration;
import java.util.Optional;

public abstract class AbstractCachingJstTokenStore implements JstTokenStore {

    @Override
    public Optional<String> getAccessToken(String appKey) {
        return getCacheValue(buildAccessTokenCacheKey(appKey));
    }

    @Override
    public void setAccessToken(String appKey, String accessToken, Duration expiresIn) {
        setCache(buildAccessTokenCacheKey(appKey), accessToken, expiresIn);
    }

    private String buildAccessTokenCacheKey(String appKey) {
        return String.format("jst:%s:access_token", appKey);
    }

    @Override
    public Optional<String> getRefreshToken(String appKey) {
        return getCacheValue(buildRefreshTokenCacheKey(appKey));
    }

    @Override
    public void setRefreshToken(String appKey, String refreshToken, Duration expiresIn) {
        setCache(buildRefreshTokenCacheKey(appKey), refreshToken, expiresIn);
    }

    protected abstract Optional<String> getCacheValue(String cacheKey);

    protected abstract void setCache(String cacheKey, String cacheValue, Duration expiresIn);

    private String buildRefreshTokenCacheKey(String appKey) {
        return String.format("jst:%s:refresh_token", appKey);
    }
}
