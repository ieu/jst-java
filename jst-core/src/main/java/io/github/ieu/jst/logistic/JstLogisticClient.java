package io.github.ieu.jst.logistic;

import io.github.ieu.jst.logistic.model.Logistic;
import io.github.ieu.jst.logistic.model.LogisticQueryParam;

import java.util.List;

public interface JstLogisticClient {
    /**
     * 发货信息查询
     *
     * @param param 查询参数
     * @see <a href="https://open.jushuitan.com/document/2159.html">https://open.jushuitan.com/document/2159.html</a>
     */
    List<Logistic> queryLogistic(LogisticQueryParam param);
}
