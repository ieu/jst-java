package io.github.ieu.jst;

/**
 * @see <a href="https://openweb.jushuitan.com/doc?docId=70">签名规则</a>
 */
public interface JstBizDigest {
    void sign(JstBizRequest request);
}
