package io.github.ieu.jst.order;

import io.github.ieu.jst.order.model.Order;
import io.github.ieu.jst.order.model.OrdersSingleQueryParam;

import java.util.List;

public interface JstOrderClient {
    /**
     * 订单查询
     *
     * @param param 查询参数
     * @see <a href="https://open.jushuitan.com/document/2125.html">https://open.jushuitan.com/document/2125.html</a>
     */
    List<Order> querySingleOrder(OrdersSingleQueryParam param);
}
