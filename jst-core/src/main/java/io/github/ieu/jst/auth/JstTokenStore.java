package io.github.ieu.jst.auth;

import java.time.Duration;
import java.util.Optional;

public interface JstTokenStore {
    Optional<String> getAccessToken(String appKey);

    void setAccessToken(String appKey, String accessToken, Duration expiresIn);

    Optional<String> getRefreshToken(String appKey);

    void setRefreshToken(String appKey, String refreshToken, Duration expiresIn);
}
