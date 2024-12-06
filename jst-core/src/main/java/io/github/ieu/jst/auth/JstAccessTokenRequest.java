package io.github.ieu.jst.auth;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @see <a href="https://openweb.jushuitan.com/doc?docId=23#814368d2831c428aae8368723ba3ea7c">获取access_token、refresh_token</a>
 * @see <a href="https://openweb.jushuitan.com/doc?docId=25#a5549565d79d4bf0a466de40bceb22d4">使用code换取access_token</a>
 */
@Data
@Accessors(chain = true)
public class JstAccessTokenRequest {
    /**
     * 开发者应用Key
     */
    private String appKey;

    /**
     * 当前请求的时间戳【单位是秒】
     */
    private String timestamp;

    /**
     * 固定值：authorization_code
     */
    private String grantType = "authorization_code";

    /**
     * 交互数据的编码【utf-8】目前只能传utf-8，不能不传！
     */
    private String charset = "utf-8";

    /**
     * 授权码
     * <p>
     * 商家自研系统授权流程为随机码（随机创建六位字符串）自定义值
     * <p>
     * 第三方授权流程为授权码
     */
    private String code;

    /**
     * 请求的数字签名，是通过所有请求参数通过摘要生成的，保证请求参数没有被篡改。签名拼装规则参考：<a href="https://openweb.jushuitan.com/doc?docId=70">签名规则</a>
     */
    private String sign;
}
