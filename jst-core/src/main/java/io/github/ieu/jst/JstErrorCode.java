package io.github.ieu.jst;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Getter
@AllArgsConstructor
@Accessors(fluent = true)
public enum JstErrorCode {
    /**
     * 执行成功
     * <p>
     * 执行成功
     */
    SUCCESS(0),

    /**
     * 验证失败！无效签名
     * <p>
     * 参考<a href="https://openweb.jushuitan.com/doc?docId=70">签名规则</a>
     */
    INVALID_SIGNATURE(10),

    /**
     * 调用频次超过限制!请稍后再试
     * <p>
     * 请求频率一秒不超过5次
     */
    RATE_LIMIT_EXCEEDED(199),

    /**
     * 调用频次超过限制
     * <p>
     * 请求频率一分钟不超过100次
     */
    RATE_LIMIT_HIT(200),

    /**
     * 验证失败！无效的access_token或access_token已过期
     * <p>
     * 根据应用类型选择授权方式：自有商城应用token过期参考https://openweb.jushuitan.com/doc?docId=23服务商token过期参考https://openweb.jushuitan.com/doc?docId=25
     */
    INVALID_OR_EXPIRED_TOKEN(100),

    /**
     * 验证失败！已设置IP白名单，该IP不在白名单列表：xx.xx.xx.xx，请登录开发者后台自行添加IP
     * <p>
     * ip无效，请登陆开放平台后台应用-详情-IP白名单，添加
     */
    IP_NOT_WHITELISTED(110),

    /**
     * 服务商应用禁止刷新access_token,需商户重新授权
     * <p>
     * 自2023年8月15日起，服务商禁止刷新token，具体请查看开放平台公告详情，服务商token过期请走服务商重新授权流程https://openweb.jushuitan.com/doc?docId=25
     */
    TOKEN_REFRESH_FORBIDDEN(150),

    /**
     * 验证失败！无效的timestamp，请求最大时间误差15分钟
     * <p>
     * 时间戳参数请保持在请求接口的15分钟以内的时间范围内，若报错，请重复获取最新的时间戳进行请求
     */
    INVALID_TIMESTAMP(140),

    /**
     * 验证失败！无API权限，请申请API权限
     * <p>
     * 调用无权限，请登录右上角控制台，在应用详情- API权限申请页面申请对应接口权限
     * <p>
     * 目前申请的应用是在聚水潭erp中申请的“财务称重授权码”，该应用只能用于称重接口和财务小工具对接，不支持其他业务接口使用。如需对接其他业务接口，请登录开放平台重新注册一个应用用于对接
     */
    NO_API_PERMISSION(190);

    private static volatile Map<Integer, JstErrorCode> enumConstantDirectory = null;
    private final int code;

    public static JstErrorCode valueOf(Integer code, JstErrorCode defaultValue) {
        return optionalValueOf(code).orElse(defaultValue);
    }

    public static Optional<JstErrorCode> optionalValueOf(Integer code) {
        return Optional.ofNullable(nullableValueOf(code));
    }

    public static JstErrorCode valueOf(Integer code) {
        JstErrorCode result = nullableValueOf(code);
        if (result != null)
            return result;
        throw new IllegalArgumentException(
                "No enum constant " + JstErrorCode.class.getCanonicalName() + "." + code);
    }

    public static JstErrorCode nullableValueOf(Integer code) {
        if (code == null)
            throw new NullPointerException("Code is null");
        return enumConstantDirectory().get(code);
    }

    private static Map<Integer, JstErrorCode> enumConstantDirectory() {
        if (enumConstantDirectory == null) {
            synchronized (JstErrorCode.class) {
                if (enumConstantDirectory == null) {
                    JstErrorCode[] statuses = JstErrorCode.values();
                    Map<Integer, JstErrorCode> m = new HashMap<>(statuses.length);
                    for (JstErrorCode constant : statuses)
                        m.put(constant.code(), constant);
                    enumConstantDirectory = m;
                }
            }
        }
        return enumConstantDirectory;
    }

    public boolean is(int code) {
        return this.code == code;
    }
}
