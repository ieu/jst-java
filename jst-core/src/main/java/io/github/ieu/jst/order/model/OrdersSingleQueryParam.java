package io.github.ieu.jst.order.model;

import io.github.ieu.jst.PaginationQueryParam;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.ZonedDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@With
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OrdersSingleQueryParam extends PaginationQueryParam {
    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 线上单号，最大限制20条
     */
    private List<String> soIds;
    /**
     * ERP 修改起始时间
     */
    private ZonedDateTime modifiedBegin;
    /**
     * ERP 修改结束时间 ；起始结束时间不超过7天
     */
    private ZonedDateTime modifiedEnd;
    /**
     * 待付款：WaitPay；
     * 发货中：Delivering；
     * 被合并：Merged；
     * 异常：Question；
     * 被拆分：Split；
     * 等供销商|外仓发货：WaitOuterSent；
     * 已付款待审核：WaitConfirm；
     * 已客审待财审：WaitFConfirm；
     * 已发货：Sent；
     * 取消：Cancelled
     */
    private OrderStatus status;
}
