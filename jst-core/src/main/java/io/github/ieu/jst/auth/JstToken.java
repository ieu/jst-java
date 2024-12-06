package io.github.ieu.jst.auth;

import lombok.Data;

@Data
public class JstToken {
    /**
     * 访问令牌
     */
    private String accessToken;

    /**
     * access_token访问过期时间【单位是秒】，还有多少秒后过期
     */
    private int expiresIn;

    /**
     * 更新令牌
     */
    private String refreshToken;

    /**
     * 固定值：all
     */
    private String scope;
}
