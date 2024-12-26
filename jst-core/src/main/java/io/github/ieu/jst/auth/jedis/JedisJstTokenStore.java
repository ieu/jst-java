package io.github.ieu.jst.auth.jedis;

import io.github.ieu.jst.JstConvention;
import io.github.ieu.jst.auth.AbstractCachingJstTokenStore;
import io.github.ieu.jst.auth.JstTokenStore;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.params.SetParams;

import java.time.Duration;
import java.util.Optional;

public class JedisJstTokenStore extends AbstractCachingJstTokenStore implements JstTokenStore {

    private final JedisPool jedisPool;

    public JedisJstTokenStore(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

    @Override
    protected Optional<String> getCacheValue(String cacheKey) {
        try (Jedis jedis = jedisPool.getResource()) {
            return Optional.ofNullable(jedis.get(cacheKey.getBytes(JstConvention.DEFAULT_CHARSET)))
                    .map(String::new);
        }
    }

    @Override
    protected void setCache(String cacheKey, String cacheValue, Duration expiresIn) {
        try (Jedis jedis = jedisPool.getResource()) {
            jedis.set(
                    cacheKey.getBytes(JstConvention.DEFAULT_CHARSET),
                    cacheValue.getBytes(JstConvention.DEFAULT_CHARSET),
                    SetParams.setParams().exAt(expiresIn.getSeconds())
            );
        }
    }
}
