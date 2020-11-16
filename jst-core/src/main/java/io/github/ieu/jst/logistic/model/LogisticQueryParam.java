package io.github.ieu.jst.logistic.model;

import io.github.ieu.jst.PaginationQueryParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.time.ZonedDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class LogisticQueryParam extends PaginationQueryParam {
    public LogisticQueryParam() {
        setPageSize(30);
    }

    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天
     */
    private ZonedDateTime modifiedBegin;
    /**
     * 修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天
     */
    private ZonedDateTime modifiedEnd;
    /**
     * 平台订单编号,最多20
     */
    private List<String> soIds;
}
