package io.github.ieu.jst.auth.jedis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;
import redis.clients.jedis.JedisPool;

import java.time.Duration;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Testcontainers(disabledWithoutDocker = true)
class JedisJstTokenStoreTest {

    @Container
    final GenericContainer<?> redis = new GenericContainer<>(DockerImageName.parse("redis:latest"))
            .withExposedPorts(6379);

    JedisPool jedisPool;

    @BeforeEach
    void setup() {
        this.jedisPool = new JedisPool(redis.getHost(), redis.getMappedPort(6379));
    }

    @Test
    void getAccessToken_shouldReturnAccessToken() {
        JedisJstTokenStore tokenStore = new JedisJstTokenStore(jedisPool);
        tokenStore.setAccessToken("5b53060f23d84ddf9703056e84fa5a2d", "0ecde8631431a5ed6b3e7368afbabdadss", Duration.ofSeconds(Integer.MAX_VALUE));
        assertEquals(Optional.of("0ecde8631431a5ed6b3e7368afbabdadss"), tokenStore.getAccessToken("5b53060f23d84ddf9703056e84fa5a2d"));
    }

    @Test
    void getAccessToken_shouldReturnEmptyIfExpired() throws Exception {
        JedisJstTokenStore tokenStore = new JedisJstTokenStore(jedisPool);
        tokenStore.setAccessToken("5b53060f23d84ddf9703056e84fa5a2d", "0ecde8631431a5ed6b3e7368afbabdadss", Duration.ofSeconds(1));
        Thread.sleep(1000);
        assertEquals(Optional.empty(), tokenStore.getAccessToken("5b53060f23d84ddf9703056e84fa5a2d"));
    }

    @Test
    void getRefreshToken_shouldReturnRefreshToken() {
        JedisJstTokenStore tokenStore = new JedisJstTokenStore(jedisPool);
        tokenStore.setRefreshToken("5b53060f23d84ddf9703056e84fa5a2d", "eb1964a9d142423a9f0de88b97bb38fc", Duration.ofSeconds(Integer.MAX_VALUE));
        assertEquals(Optional.of("eb1964a9d142423a9f0de88b97bb38fc"), tokenStore.getRefreshToken("5b53060f23d84ddf9703056e84fa5a2d"));
    }

    @Test
    void getRefreshToken_shouldReturnEmptyIfExpired() throws Exception {
        JedisJstTokenStore tokenStore = new JedisJstTokenStore(jedisPool);
        tokenStore.setRefreshToken("5b53060f23d84ddf9703056e84fa5a2d", "eb1964a9d142423a9f0de88b97bb38fc", Duration.ofSeconds(1));
        Thread.sleep(1000);
        assertEquals(Optional.empty(), tokenStore.getRefreshToken("5b53060f23d84ddf9703056e84fa5a2d"));
    }
}
