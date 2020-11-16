package io.github.ieu.jst;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@AllArgsConstructor
@Accessors(fluent = true)
public enum JstResultCode {
    /**
     * 执行成功
     */
    SUCCEEDED(0),
    /**
     * 合作者参数错误
     */
    INVALID_PARTNER_PARAMETER(100),
    /**
     * 签名错误
     */
    INVALID_SIGNATURE(120),
    /**
     * 传输数据错误
     */
    INVALID_DATA(130),
    /**
     * 传递参数有误
     */
    INVALID_PARAMETER(140),
    /**
     * 内部处理数据出错
     */
    INTERNAL_PROCESSING_ERROR(150),
    /**
     * 内部保存时间失败
     */
    INTERNAL_PERSISTENCE_ERROR(160),
    /**
     * 验证数据完整性失败，如Token 已超时
     */
    INTEGRITY_VERIFICATION_FAILURE(170),
    /**
     * TS无效
     */
    INVALID_TIMESTAMP(180),
    /**
     * 调用无权限，请申请该接口权限
     */
    PERMISSION_DENIED(190),
    /**
     * 调用超过频率，请稍后重试
     */
    RATE_LIMIT_ERROR(200);

    @Getter
    private final int code;

    public static JstResultCode valueOf(Integer code, JstResultCode defaultValue) {
        return optionalValueOf(code).orElse(defaultValue);
    }

    public static Optional<JstResultCode> optionalValueOf(Integer code) {
        return Optional.ofNullable(nullableValueOf(code));
    }

    public static JstResultCode valueOf(Integer code) {
        JstResultCode result = nullableValueOf(code);
        if (result != null)
            return result;
        throw new IllegalArgumentException(
                "No enum constant " + JstResultCode.class.getCanonicalName() + "." + code);
    }

    public static JstResultCode nullableValueOf(Integer code) {
        if (code == null)
            throw new NullPointerException("Code is null");
        return enumConstantDirectory().get(code);
    }

    private static Map<Integer, JstResultCode> enumConstantDirectory() {
        if (enumConstantDirectory == null) {
            synchronized (JstResultCode.class) {
                if (enumConstantDirectory == null) {
                    JstResultCode[] statuses = JstResultCode.values();
                    Map<Integer, JstResultCode> m = new HashMap<>(statuses.length);
                    for (JstResultCode constant : statuses)
                        m.put(constant.code(), constant);
                    enumConstantDirectory = m;
                }
            }
        }
        return enumConstantDirectory;
    }

    private static volatile Map<Integer, JstResultCode> enumConstantDirectory = null;
}
