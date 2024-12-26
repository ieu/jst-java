package io.github.ieu.jst.auth.jedis;

import io.github.ieu.jst.auth.JstTokenStore;
import io.github.ieu.jst.auth.JstTokenStoreFactory;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisPool;

@Getter
@Setter
@Accessors(fluent = true, chain = true)
public class JedisJstTokenStoreFactory implements JstTokenStoreFactory {

    private String host;

    private Integer port;

    private Integer database;

    private String user;

    private String password;

    private Boolean sslEnabled;

    @Override
    public JstTokenStore create() {
        String host = this.host;
        if (host == null) {
            host = "localhost";
        }

        Integer port = this.port;
        if (port == null) {
            port = 3306;
        }

        HostAndPort hostAndPort = new HostAndPort(host, port);

        DefaultJedisClientConfig.Builder configBuilder = DefaultJedisClientConfig.builder();

        Integer database = this.database;
        if (database != null) {
            configBuilder.database(database);
        }

        String user = this.user;
        if (user != null) {
            configBuilder.user(user);
        }

        String password = this.password;
        if (password != null) {
            configBuilder.password(password);
        }

        Boolean sslEnabled = this.sslEnabled;
        if (sslEnabled != null) {
            configBuilder.ssl(sslEnabled);
        }

        DefaultJedisClientConfig config = configBuilder.build();

        JedisPool jedisPool = new JedisPool(hostAndPort, config);

        return new JedisJstTokenStore(jedisPool);
    }
}
