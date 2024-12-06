package io.github.ieu.jst.auth;

/**
 * @see <a href="https://openweb.jushuitan.com/doc?docId=70">签名规则</a>
 */
public interface JstAuthDigest {
    JstAccessTokenRequest sign(JstAccessTokenRequest request);

    JstRefreshTokenRequest sign(JstRefreshTokenRequest request);
}
