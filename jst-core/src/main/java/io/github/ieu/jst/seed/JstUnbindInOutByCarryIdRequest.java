package io.github.ieu.jst.seed;

@lombok.Data
@lombok.Builder
public class JstUnbindInOutByCarryIdRequest {

    /**
     * 车号
     */
    private String carryId;

    /**
     * 传true
     */
    private Boolean isAppendJbCc;
}
