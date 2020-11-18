package io.github.ieu.jst.order;

import io.github.ieu.jst.MathUtils;
import io.github.ieu.jst.RequestHelper;
import io.github.ieu.jst.order.model.Order;
import io.github.ieu.jst.order.model.OrdersSingleQueryParam;
import io.github.ieu.jst.order.model.OrdersSingleQueryResult;

import java.util.List;

public class DefaultJstOrderClient implements JstOrderClient {
    private final RequestHelper requestHelper;

    public DefaultJstOrderClient(RequestHelper requestHelper) {
        this.requestHelper = requestHelper;
    }

    @Override
    public List<Order> querySingleOrder(OrdersSingleQueryParam param) {
        param.setPageIndex(Math.max(param.getPageIndex(), 1));
        param.setPageSize(MathUtils.clamp(param.getPageSize(), 0, 50));

        return requestHelper.request(
                "orders.single.query",
                param,
                OrdersSingleQueryResult.class
        ).getOrders();
    }
}
