package io.github.ieu.jst.inventory;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

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
        return execute("/open/inventory/query", request, JstQueryInventoryResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=16">库存盘点查询</a>
     */
    @Override
    public JstQueryInventoryCountResponse queryInventoryCount(JstQueryInventoryCountRequest request) {
        return execute("/open/inventory/count/query", request, JstQueryInventoryCountResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=78">箱及仓位库存查询</a>
     */
    @Override
    public JstQueryPackResponse queryPack(JstQueryPackRequest request) {
        return execute("/open/pack/query", request, JstQueryPackResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=85">新建盘点单-修改库存</a>
     */
    @Override
    public JstUploadInventoryV2Response uploadInventoryV2(JstUploadInventoryV2Request request) {
        return execute("/open/jushuitan/inventoryv2/upload", request, JstUploadInventoryV2Response.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=631">导入/更新虚拟库存</a>
     */
    @Override
    public JstBatchUpdateWmsVirtualQtysResponse batchUpdateWmsVirtualQtys(JstBatchUpdateWmsVirtualQtysRequest request) {
        return execute("/open/webapi/itemapi/iteminventory/batchupdatewmsvirtualqtys", request, JstBatchUpdateWmsVirtualQtysResponse.class);
    }
}
