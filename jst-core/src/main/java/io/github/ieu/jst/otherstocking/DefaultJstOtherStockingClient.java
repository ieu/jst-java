package io.github.ieu.jst.otherstocking;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

/**
 * 其它出入库API
 */
public class DefaultJstOtherStockingClient extends AbstractJstBizClient implements JstOtherStockingClient {

    public DefaultJstOtherStockingClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=10&docId=42">其它出入库查询</a>
     */
    @Override
    public JstQueryOtherInOutResponse queryOtherInOut(JstQueryOtherInOutRequest request) {
        return execute("/open/other/inout/query", request, JstQueryOtherInOutResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=10&docId=43">新建其它出入库</a>
     */
    @Override
    public JstUploadOtherInOutResponse uploadOtherInOut(JstUploadOtherInOutRequest request) {
        return execute("/open/jushuitan/otherinout/upload", request, JstUploadOtherInOutResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=10&docId=223">其它出入库状态变更</a>
     */
    @Override
    public JstCancelOtherInOutResponse cancelOtherInOut(JstCancelOtherInOutRequest request) {
        return execute("/open/jushuitan/otherinout/cancel", request, JstCancelOtherInOutResponse.class);
    }
}
