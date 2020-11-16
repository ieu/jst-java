package io.github.ieu.jst.base.model;

import io.github.ieu.jst.BaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class RefreshTokenResult extends BaseResult {
    Data data;

    @lombok.Data
    public static class Data {
        /**
         * 有效期
         */
        private ZonedDateTime expiredDate;
    }
}
