package io.github.ieu.jst.logistic.model;

import io.github.ieu.jst.PaginatedResult;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class LogisticQueryResult extends PaginatedResult {
    /**
     * 订单列表
     */
    private List<Logistic> orders;

}
