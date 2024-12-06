package io.github.ieu.jst.auth.caffeine;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CaffeineJstTokenStoreTest {
    @Test
    void getAccessToken_shouldReturnAccessToken() {
        CaffeineJstTokenStore tokenStore = new CaffeineJstTokenStore();
        tokenStore.setAccessToken("5b53060f23d84ddf9703056e84fa5a2d", "0ecde8631431a5ed6b3e7368afbabdadss", Duration.ofMillis(Integer.MAX_VALUE));
        assertEquals(Optional.of("0ecde8631431a5ed6b3e7368afbabdadss"), tokenStore.getAccessToken("5b53060f23d84ddf9703056e84fa5a2d"));
    }

    @Test
    void getAccessToken_shouldReturnEmptyIfExpired() {
        CaffeineJstTokenStore tokenStore = new CaffeineJstTokenStore();
        tokenStore.setAccessToken("5b53060f23d84ddf9703056e84fa5a2d", "0ecde8631431a5ed6b3e7368afbabdadss", Duration.ZERO);
        assertEquals(Optional.empty(), tokenStore.getAccessToken("5b53060f23d84ddf9703056e84fa5a2d"));
    }

    @Test
    void getRefreshToken_shouldReturnRefreshToken() {
        CaffeineJstTokenStore tokenStore = new CaffeineJstTokenStore();
        tokenStore.setRefreshToken("5b53060f23d84ddf9703056e84fa5a2d", "eb1964a9d142423a9f0de88b97bb38fc", Duration.ofMillis(Integer.MAX_VALUE));
        assertEquals(Optional.of("eb1964a9d142423a9f0de88b97bb38fc"), tokenStore.getRefreshToken("5b53060f23d84ddf9703056e84fa5a2d"));
    }

    @Test
    void getRefreshToken_shouldReturnEmptyIfExpired() {
        CaffeineJstTokenStore tokenStore = new CaffeineJstTokenStore();
        tokenStore.setRefreshToken("5b53060f23d84ddf9703056e84fa5a2d", "eb1964a9d142423a9f0de88b97bb38fc", Duration.ZERO);
        assertEquals(Optional.empty(), tokenStore.getRefreshToken("5b53060f23d84ddf9703056e84fa5a2d"));
    }
}