package io.github.ieu.jst.allocate;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

/**
 * 调拨API
 */
public class DefaultJstAllocateClient extends AbstractJstBizClient implements JstAllocateClient {

    public DefaultJstAllocateClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=47">调拨单查询</a>
     */
    @Override
    public JstQueryAllocateResponse queryAllocate(JstQueryAllocateRequest request) {
        return execute("/open/allocate/query", request, JstQueryAllocateResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=48">库存调拨上传（跨仓调拨）</a>
     */
    @Override
    public JstUploadKcAllocateResponse uploadKcAllocate(java.util.List<JstUploadKcAllocateRequest> request) {
        return execute("/open/allocate/kc/upload", request, JstUploadKcAllocateResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=49">库存调拨上传（仓内调拨）</a>
     */
    @Override
    public JstUploadInAllocateResponse uploadInAllocate(JstUploadInAllocateRequest request) {
        return execute("/open/jushuitan/allocate/in/upload", request, JstUploadInAllocateResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=64">调拨单确认</a>
     */
    @Override
    public JstConfirmAllocateResponse confirmAllocate(JstConfirmAllocateRequest request) {
        return execute("/open/jushuitan/allocate/confirm", request, JstConfirmAllocateResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=266">调拨单取消</a>
     */
    @Override
    public JstCancelAllocateV2Response cancelAllocateV2(JstCancelAllocateV2Request request) {
        return execute("/open/jushuitan/allocate/cancel/v2", request, JstCancelAllocateV2Response.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=357">创建调拨差异单</a>
     */
    @Override
    public JstCreateDiffAllocateResponse createDiffAllocate(JstCreateDiffAllocateRequest request) {
        return execute("/open/jushuitan/diffallocate/create", request, JstCreateDiffAllocateResponse.class);
    }
}
