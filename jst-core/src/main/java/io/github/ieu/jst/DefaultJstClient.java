package io.github.ieu.jst;

import io.github.ieu.jst.base.DefaultJstBaseClient;
import io.github.ieu.jst.base.JstBaseClient;
import io.github.ieu.jst.logistic.DefaultJstLogisticClient;
import io.github.ieu.jst.logistic.JstLogisticClient;
import io.github.ieu.jst.order.DefaultJstOrderClient;
import io.github.ieu.jst.order.JstOrderClient;

public class DefaultJstClient implements JstClient {
    private final JstEndpoint JST_ENDPOINT = new JstEndpoint();

    private final RequestHelper requestHelper;

    public DefaultJstClient(String partnerId, String partnerKey, String token, JstEnvironment env) {
        requestHelper = new RequestHelper(
                partnerId,
                partnerKey,
                token,
                JST_ENDPOINT.get(env)
        );
    }

    public DefaultJstClient(String partnerId, String partnerKey, String token) {
        this(partnerId, partnerKey, token, JstEnvironment.PRODUCTION);
    }

    private volatile JstBaseClient jstBaseClient;

    @Override
    public JstBaseClient base() {
        if (jstBaseClient == null) {
            synchronized (this) {
                if (jstBaseClient == null) {
                    jstBaseClient = new DefaultJstBaseClient(requestHelper);
                }
            }
        }
        return jstBaseClient;
    }

    private volatile JstOrderClient jstOrderClient;

    @Override
    public JstOrderClient order() {
        if (jstOrderClient == null) {
            synchronized (this) {
                if (jstOrderClient == null) {
                    jstOrderClient = new DefaultJstOrderClient(requestHelper);
                }
            }
        }
        return jstOrderClient;
    }

    private volatile JstLogisticClient jstLogisticClient;

    @Override
    public JstLogisticClient logistic() {
        if (jstLogisticClient == null) {
            synchronized (this) {
                if (jstLogisticClient == null) {
                    jstLogisticClient = new DefaultJstLogisticClient(requestHelper);
                }
            }
        }
        return jstLogisticClient;
    }
}
