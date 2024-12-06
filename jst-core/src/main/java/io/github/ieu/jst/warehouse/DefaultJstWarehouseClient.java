package io.github.ieu.jst.warehouse;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

/**
 * 虚拟仓API
 */
public class DefaultJstWarehouseClient extends AbstractJstBizClient implements JstWarehouseClient {

    public DefaultJstWarehouseClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=340">虚拟仓调拨单据分页接口</a>
     */
    @Override
    public JstGetLwhAllocationListResponse getLwhAllocationList(JstGetLwhAllocationListRequest request) {
        return execute("/open/webapi/itemapi/lockwarehouse/getlwhallocationlist", request, JstGetLwhAllocationListResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=341">虚拟仓分配归还单据分页接口</a>
     */
    @Override
    public JstGetLwhOperationListResponse getLwhOperationList(JstGetLwhOperationListRequest request) {
        return execute("/open/webapi/itemapi/lockwarehouse/getlwhoperationlist", request, JstGetLwhOperationListResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=342">虚拟仓调拨单创建接口</a>
     */
    @Override
    public JstCreateLwhAllocationResponse createLwhAllocation(JstCreateLwhAllocationRequest request) {
        return execute("/open/webapi/itemapi/lockwarehouse/lwhallocationcreate", request, JstCreateLwhAllocationResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=343">虚拟仓分配/归还单据创建接口</a>
     */
    @Override
    public JstCreateLwhOperationResponse createLwhOperation(JstCreateLwhOperationRequest request) {
        return execute("/open/webapi/itemapi/lockwarehouse/lwhoperationcreate", request, JstCreateLwhOperationResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=490">获取虚拟仓列表</a>
     */
    @Override
    public JstGetWarehouseListResponse getWarehouseList(JstGetWarehouseListRequest request) {
        return execute("/open/webapi/itemapi/lockwarehouse/getwarehouselist", request, JstGetWarehouseListResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=625">虚拟仓商品库存查询</a>
     */
    @Override
    public JstGetVirtualStockResponse getVirtualStock(JstGetVirtualStockRequest request) {
        return execute("/open/webapi/itemapi/iteminventory/getvirtualstock", request, JstGetVirtualStockResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=799">创建/更新虚拟仓采购申请</a>
     */
    @Override
    public JstCreateOrUpdateLockPurchaseResponse createOrUpdateLockPurchase(JstCreateOrUpdateLockPurchaseRequest request) {
        return execute("/open/webapi/itemapi/lockwarehouse/lockpurchase/createorupdatepurchase", request, JstCreateOrUpdateLockPurchaseResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=802">查询虚拟仓采购单</a>
     */
    @Override
    public JstGetPageLockPurchasesResponse getPageLockPurchases(JstGetPageLockPurchasesRequest request) {
        return execute("/open/webapi/itemapi/lockwarehouse/lockpurchase/getpagelockpurchases", request, JstGetPageLockPurchasesResponse.class);
    }
}
