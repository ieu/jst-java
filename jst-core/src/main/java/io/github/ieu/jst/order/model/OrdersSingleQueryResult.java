package io.github.ieu.jst.order.model;

import io.github.ieu.jst.PaginatedResult;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class OrdersSingleQueryResult extends PaginatedResult {
    private List<Order> orders;
}
