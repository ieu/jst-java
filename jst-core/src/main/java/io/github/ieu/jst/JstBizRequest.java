package io.github.ieu.jst;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @see <a href="https://openweb.jushuitan.com/doc?docId=30#3c0d4fa1cbb146c9ac4ee08b004c17d9">https://openweb.jushuitan.com/doc?docId=30#3c0d4fa1cbb146c9ac4ee08b004c17d9</a>
 */
@Data
@Accessors(chain = true)
public class JstBizRequest {
    /**
     * 商户授权token值
     */
    private String accessToken;

    /**
     * 开发者应用Key
     */
    private String appKey;

    /**
     * 当前请求的时间戳【单位是秒】，Unix纪元到当前时间的秒数，10位，允许时间最大误差范围为10分钟
     */
    private String timestamp;

    /**
     * 接口版本，当前版本为【2】,目前只能传2，不能不传！
     */
    private String version = "2";

    /**
     * 交互数据的编码【utf-8】目前只能传utf-8，不能不传！
     */
    private String charset = "utf-8";

    /**
     * 请求的数字签名，是通过所有请求参数通过摘要生成的，保证请求参数没有被篡改。
     */
    private String sign;

    /**
     * 业务请求参数，格式为jsonString，详细说明见下方【业务参数】。该参数为必填参数，如果接口不需要业务参数，请传空json对象字符串 "{}"
     */
    private String biz;
}
