package io.github.ieu.jst.auth;

import java.time.Duration;
import java.util.Optional;

public class TestJstTokenStore implements JstTokenStore {
    @Override
    public Optional<String> getAccessToken(String appKey) {
        return Optional.of("b7e3b1e24e174593af8ca5c397e53dad");
    }

    @Override
    public void setAccessToken(String appKey, String accessToken, Duration expiresIn) {
        throw new UnsupportedOperationException("setAccessToken is not implemented");
    }

    @Override
    public Optional<String> getRefreshToken(String appKey) {
        throw new UnsupportedOperationException("getRefreshToken is not implemented");
    }

    @Override
    public void setRefreshToken(String appKey, String refreshToken, Duration expiresIn) {
        throw new UnsupportedOperationException("setRefreshToken is not implemented");
    }
}
