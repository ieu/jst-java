package io.github.ieu.jst.allocate;

/**
 * 调拨API
 */
public interface JstAllocateClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=47">调拨单查询</a>
     */
    JstQueryAllocateResponse queryAllocate(JstQueryAllocateRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=47">调拨单查询</a>
     */
    JstQueryAllocateSpec queryAllocate();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=48">库存调拨上传（跨仓调拨）</a>
     */
    JstUploadKcAllocateResponse uploadKcAllocate(java.util.List<JstUploadKcAllocateRequest> request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=48">库存调拨上传（跨仓调拨）</a>
     */
    JstUploadKcAllocateSpec uploadKcAllocate();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=49">库存调拨上传（仓内调拨）</a>
     */
    JstUploadInAllocateResponse uploadInAllocate(JstUploadInAllocateRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=49">库存调拨上传（仓内调拨）</a>
     */
    JstUploadInAllocateSpec uploadInAllocate();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=64">调拨单确认</a>
     */
    JstConfirmAllocateResponse confirmAllocate(JstConfirmAllocateRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=64">调拨单确认</a>
     */
    JstConfirmAllocateSpec confirmAllocate();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=266">调拨单取消</a>
     */
    JstCancelAllocateV2Response cancelAllocateV2(JstCancelAllocateV2Request request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=266">调拨单取消</a>
     */
    JstCancelAllocateV2Spec cancelAllocateV2();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=357">创建调拨差异单</a>
     */
    JstCreateDiffAllocateResponse createDiffAllocate(JstCreateDiffAllocateRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=12&docId=357">创建调拨差异单</a>
     */
    JstCreateDiffAllocateSpec createDiffAllocate();
}
