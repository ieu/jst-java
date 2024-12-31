package io.github.ieu.jst.otherstocking;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstErrorCode;
import io.github.ieu.jst.JstServerException;

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
        JstQueryOtherInOutResponse response = execute("/open/other/inout/query", request, JstQueryOtherInOutResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=10&docId=42">其它出入库查询</a>
     */
    @Override
    public JstQueryOtherInOutSpec queryOtherInOut() {
        return new JstQueryOtherInOutSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=10&docId=43">新建其它出入库</a>
     */
    @Override
    public JstUploadOtherInOutResponse uploadOtherInOut(JstUploadOtherInOutRequest request) {
        JstUploadOtherInOutResponse response = execute("/open/jushuitan/otherinout/upload", request, JstUploadOtherInOutResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=10&docId=43">新建其它出入库</a>
     */
    @Override
    public JstUploadOtherInOutSpec uploadOtherInOut() {
        return new JstUploadOtherInOutSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=10&docId=223">其它出入库状态变更</a>
     */
    @Override
    public JstCancelOtherInOutResponse cancelOtherInOut(JstCancelOtherInOutRequest request) {
        JstCancelOtherInOutResponse response = execute("/open/jushuitan/otherinout/cancel", request, JstCancelOtherInOutResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=10&docId=223">其它出入库状态变更</a>
     */
    @Override
    public JstCancelOtherInOutSpec cancelOtherInOut() {
        return new JstCancelOtherInOutSpec(this);
    }
}
