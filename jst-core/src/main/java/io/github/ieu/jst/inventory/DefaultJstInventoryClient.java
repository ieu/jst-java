package io.github.ieu.jst.inventory;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstErrorCode;
import io.github.ieu.jst.JstServerException;

/**
 * 库存API
 */
public class DefaultJstInventoryClient extends AbstractJstBizClient implements JstInventoryClient {

    public DefaultJstInventoryClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=15">商品库存查询</a>
     */
    @Override
    public JstQueryInventoryResponse queryInventory(JstQueryInventoryRequest request) {
        JstQueryInventoryResponse response = execute("/open/inventory/query", request, JstQueryInventoryResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=15">商品库存查询</a>
     */
    @Override
    public JstQueryInventorySpec queryInventory() {
        return new JstQueryInventorySpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=16">库存盘点查询</a>
     */
    @Override
    public JstQueryInventoryCountResponse queryInventoryCount(JstQueryInventoryCountRequest request) {
        JstQueryInventoryCountResponse response = execute("/open/inventory/count/query", request, JstQueryInventoryCountResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=16">库存盘点查询</a>
     */
    @Override
    public JstQueryInventoryCountSpec queryInventoryCount() {
        return new JstQueryInventoryCountSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=78">箱及仓位库存查询</a>
     */
    @Override
    public JstQueryPackResponse queryPack(JstQueryPackRequest request) {
        JstQueryPackResponse response = execute("/open/pack/query", request, JstQueryPackResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=78">箱及仓位库存查询</a>
     */
    @Override
    public JstQueryPackSpec queryPack() {
        return new JstQueryPackSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=85">新建盘点单-修改库存</a>
     */
    @Override
    public JstUploadInventoryV2Response uploadInventoryV2(JstUploadInventoryV2Request request) {
        JstUploadInventoryV2Response response = execute("/open/jushuitan/inventoryv2/upload", request, JstUploadInventoryV2Response.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=85">新建盘点单-修改库存</a>
     */
    @Override
    public JstUploadInventoryV2Spec uploadInventoryV2() {
        return new JstUploadInventoryV2Spec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=631">导入/更新虚拟库存</a>
     */
    @Override
    public JstBatchUpdateWmsVirtualQtysResponse batchUpdateWmsVirtualQtys(JstBatchUpdateWmsVirtualQtysRequest request) {
        JstBatchUpdateWmsVirtualQtysResponse response = execute("/open/webapi/itemapi/iteminventory/batchupdatewmsvirtualqtys", request, JstBatchUpdateWmsVirtualQtysResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=631">导入/更新虚拟库存</a>
     */
    @Override
    public JstBatchUpdateWmsVirtualQtysSpec batchUpdateWmsVirtualQtys() {
        return new JstBatchUpdateWmsVirtualQtysSpec(this);
    }
}
