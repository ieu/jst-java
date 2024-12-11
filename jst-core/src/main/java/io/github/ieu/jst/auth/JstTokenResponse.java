package io.github.ieu.jst.auth;

import lombok.Data;

/**
 * @see <a href="https://openweb.jushuitan.com/doc?docId=23#814368d2831c428aae8368723ba3ea7c">获取access_token、refresh_token</a>
 * @see <a href="https://openweb.jushuitan.com/doc?docId=23#834cbeb011154aad979f93873395dbb5">更新access_token、refresh_token</a>
 * @see <a href="https://openweb.jushuitan.com/doc?docId=25#a5549565d79d4bf0a466de40bceb22d4">使用code换取access_token</a>
 */
@Data
public class JstTokenResponse {
    private Integer code;
    private String msg;
    private JstToken data;
}
