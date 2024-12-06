package io.github.ieu.jst.auth;

import lombok.Data;

/**
 * @see <a href="https://openweb.jushuitan.com/doc?docId=23#834cbeb011154aad979f93873395dbb5">更新access_token、refresh_token</a>
 */
@Data
public class JstRefreshTokenRequest {
    /**
     * 开发者应用Key
     */
    private String appKey;

    /**
     * 当前请求的时间戳【单位是秒】
     */
    private String timestamp;

    /**
     * 固定值：refresh_token
     */
    private String grantType = "refresh_token";

    /**
     * 交互数据的编码【utf-8】目前只能传utf-8，不能不传！
     */
    private String charset = "utf-8";

    /**
     * 更新令牌
     */
    private String refreshToken;

    /**
     * 固定值：all
     */
    private String scope = "all";

    /**
     * 请求的数字签名，是通过所有请求参数通过摘要生成的，保证请求参数没有被篡改。签名拼装规则参考：<a href="https://openweb.jushuitan.com/doc?docId=70">签名规则</a>
     */
    private String sign;
}
