package io.github.ieu.jst;

import io.github.ieu.jst.auth.JstAccessTokenRequest;
import io.github.ieu.jst.auth.JstRefreshTokenRequest;

/**
 * @see <a href="https://openweb.jushuitan.com/doc?docId=70">签名规则</a>
 */
public interface JstDigest {

    String sign(JstAccessTokenRequest request);

    String sign(JstRefreshTokenRequest request);

    String sign(JstBizRequest request);
}
