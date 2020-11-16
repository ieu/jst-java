package io.github.ieu.jst.base.model;

import io.github.ieu.jst.PaginationQueryParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.time.ZonedDateTime;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
@AllArgsConstructor
public class LogisticsCompanyQueryParam extends PaginationQueryParam {
    public LogisticsCompanyQueryParam() {
        setPageSize(30);
    }

    /**
     * 修改起始时间
     */
    private ZonedDateTime modifiedBegin;
    /**
     * 修改结束时间
     */
    private ZonedDateTime modifiedEnd;
}
