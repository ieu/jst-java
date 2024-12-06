package io.github.ieu.jst.warehouse;

/**
 * 虚拟仓API
 */
public interface JstWarehouseClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=340">虚拟仓调拨单据分页接口</a>
     */
    JstGetLwhAllocationListResponse getLwhAllocationList(JstGetLwhAllocationListRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=341">虚拟仓分配归还单据分页接口</a>
     */
    JstGetLwhOperationListResponse getLwhOperationList(JstGetLwhOperationListRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=342">虚拟仓调拨单创建接口</a>
     */
    JstCreateLwhAllocationResponse createLwhAllocation(JstCreateLwhAllocationRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=343">虚拟仓分配/归还单据创建接口</a>
     */
    JstCreateLwhOperationResponse createLwhOperation(JstCreateLwhOperationRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=490">获取虚拟仓列表</a>
     */
    JstGetWarehouseListResponse getWarehouseList(JstGetWarehouseListRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=625">虚拟仓商品库存查询</a>
     */
    JstGetVirtualStockResponse getVirtualStock(JstGetVirtualStockRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=799">创建/更新虚拟仓采购申请</a>
     */
    JstCreateOrUpdateLockPurchaseResponse createOrUpdateLockPurchase(JstCreateOrUpdateLockPurchaseRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=802">查询虚拟仓采购单</a>
     */
    JstGetPageLockPurchasesResponse getPageLockPurchases(JstGetPageLockPurchasesRequest request);
}
