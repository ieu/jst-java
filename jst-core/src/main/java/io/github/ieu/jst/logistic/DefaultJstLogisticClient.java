package io.github.ieu.jst.logistic;

import com.fasterxml.jackson.core.type.TypeReference;
import io.github.ieu.jst.MathUtils;
import io.github.ieu.jst.RequestHelper;
import io.github.ieu.jst.logistic.model.Logistic;
import io.github.ieu.jst.logistic.model.LogisticQueryParam;
import io.github.ieu.jst.logistic.model.LogisticQueryResult;

import java.util.List;

public class DefaultJstLogisticClient implements JstLogisticClient {
    private final RequestHelper requestHelper;

    public DefaultJstLogisticClient(RequestHelper requestHelper) {
        this.requestHelper = requestHelper;
    }

    @Override
    public List<Logistic> queryLogistic(LogisticQueryParam param) {
        param.setPageIndex(Math.max(param.getPageIndex(), 1));
        param.setPageSize(MathUtils.clamp(param.getPageSize(), 0, 50));

        return requestHelper.request(
                "logistic.query",
                param,
                new TypeReference<LogisticQueryResult>() {
                }
        ).getOrders();
    }
}
