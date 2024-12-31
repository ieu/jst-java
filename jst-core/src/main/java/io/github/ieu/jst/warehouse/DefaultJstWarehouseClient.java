package io.github.ieu.jst.warehouse;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstErrorCode;
import io.github.ieu.jst.JstServerException;

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
        JstGetLwhAllocationListResponse response = execute("/open/webapi/itemapi/lockwarehouse/getlwhallocationlist", request, JstGetLwhAllocationListResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=340">虚拟仓调拨单据分页接口</a>
     */
    @Override
    public JstGetLwhAllocationListSpec getLwhAllocationList() {
        return new JstGetLwhAllocationListSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=341">虚拟仓分配归还单据分页接口</a>
     */
    @Override
    public JstGetLwhOperationListResponse getLwhOperationList(JstGetLwhOperationListRequest request) {
        JstGetLwhOperationListResponse response = execute("/open/webapi/itemapi/lockwarehouse/getlwhoperationlist", request, JstGetLwhOperationListResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=341">虚拟仓分配归还单据分页接口</a>
     */
    @Override
    public JstGetLwhOperationListSpec getLwhOperationList() {
        return new JstGetLwhOperationListSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=342">虚拟仓调拨单创建接口</a>
     */
    @Override
    public JstCreateLwhAllocationResponse createLwhAllocation(JstCreateLwhAllocationRequest request) {
        JstCreateLwhAllocationResponse response = execute("/open/webapi/itemapi/lockwarehouse/lwhallocationcreate", request, JstCreateLwhAllocationResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=342">虚拟仓调拨单创建接口</a>
     */
    @Override
    public JstCreateLwhAllocationSpec createLwhAllocation() {
        return new JstCreateLwhAllocationSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=343">虚拟仓分配/归还单据创建接口</a>
     */
    @Override
    public JstCreateLwhOperationResponse createLwhOperation(JstCreateLwhOperationRequest request) {
        JstCreateLwhOperationResponse response = execute("/open/webapi/itemapi/lockwarehouse/lwhoperationcreate", request, JstCreateLwhOperationResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=343">虚拟仓分配/归还单据创建接口</a>
     */
    @Override
    public JstCreateLwhOperationSpec createLwhOperation() {
        return new JstCreateLwhOperationSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=490">获取虚拟仓列表</a>
     */
    @Override
    public JstGetWarehouseListResponse getWarehouseList(JstGetWarehouseListRequest request) {
        JstGetWarehouseListResponse response = execute("/open/webapi/itemapi/lockwarehouse/getwarehouselist", request, JstGetWarehouseListResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=490">获取虚拟仓列表</a>
     */
    @Override
    public JstGetWarehouseListSpec getWarehouseList() {
        return new JstGetWarehouseListSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=625">虚拟仓商品库存查询</a>
     */
    @Override
    public JstGetVirtualStockResponse getVirtualStock(JstGetVirtualStockRequest request) {
        JstGetVirtualStockResponse response = execute("/open/webapi/itemapi/iteminventory/getvirtualstock", request, JstGetVirtualStockResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=625">虚拟仓商品库存查询</a>
     */
    @Override
    public JstGetVirtualStockSpec getVirtualStock() {
        return new JstGetVirtualStockSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=799">创建/更新虚拟仓采购申请</a>
     */
    @Override
    public JstCreateOrUpdateLockPurchaseResponse createOrUpdateLockPurchase(JstCreateOrUpdateLockPurchaseRequest request) {
        JstCreateOrUpdateLockPurchaseResponse response = execute("/open/webapi/itemapi/lockwarehouse/lockpurchase/createorupdatepurchase", request, JstCreateOrUpdateLockPurchaseResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=799">创建/更新虚拟仓采购申请</a>
     */
    @Override
    public JstCreateOrUpdateLockPurchaseSpec createOrUpdateLockPurchase() {
        return new JstCreateOrUpdateLockPurchaseSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=802">查询虚拟仓采购单</a>
     */
    @Override
    public JstGetPageLockPurchasesResponse getPageLockPurchases(JstGetPageLockPurchasesRequest request) {
        JstGetPageLockPurchasesResponse response = execute("/open/webapi/itemapi/lockwarehouse/lockpurchase/getpagelockpurchases", request, JstGetPageLockPurchasesResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=43&docId=802">查询虚拟仓采购单</a>
     */
    @Override
    public JstGetPageLockPurchasesSpec getPageLockPurchases() {
        return new JstGetPageLockPurchasesSpec(this);
    }
}
