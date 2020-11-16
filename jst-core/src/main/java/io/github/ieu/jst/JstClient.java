package io.github.ieu.jst;

import io.github.ieu.jst.base.JstBaseClient;
import io.github.ieu.jst.logistic.JstLogisticClient;
import io.github.ieu.jst.order.JstOrderClient;

public interface JstClient {
    JstBaseClient base();
    JstOrderClient order();
    JstLogisticClient logistic();
}
