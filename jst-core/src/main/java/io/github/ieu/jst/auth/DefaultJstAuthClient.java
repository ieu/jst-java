package io.github.ieu.jst.auth;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

public class DefaultJstAuthClient extends AbstractJstBizClient implements JstAuthClient {
    public DefaultJstAuthClient(JstConfiguration configuration) {
        super(configuration);
    }

    @Override
    public JstToken getInitToken() {
        return super.authClient.getInitToken();
    }

    @Override
    public JstToken refreshToken(String refreshToken) {
        return super.authClient.refreshToken(refreshToken);
    }

    @Override
    public JstToken accessToken(String code) {
        return super.authClient.accessToken(code);
    }
}
