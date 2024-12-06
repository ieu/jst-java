package io.github.ieu.jst.qimen;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

/**
 * 奇门API
 */
public class DefaultJstQimenClient extends AbstractJstBizClient implements JstQimenClient {

    public DefaultJstQimenClient(JstConfiguration configuration) {
        super(configuration);
    }
}
