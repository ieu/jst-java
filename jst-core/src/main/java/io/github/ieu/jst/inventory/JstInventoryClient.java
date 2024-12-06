package io.github.ieu.jst.inventory;

/**
 * 库存API
 */
public interface JstInventoryClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=15">商品库存查询</a>
     */
    JstQueryInventoryResponse queryInventory(JstQueryInventoryRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=16">库存盘点查询</a>
     */
    JstQueryInventoryCountResponse queryInventoryCount(JstQueryInventoryCountRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=78">箱及仓位库存查询</a>
     */
    JstQueryPackResponse queryPack(JstQueryPackRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=85">新建盘点单-修改库存</a>
     */
    JstUploadInventoryV2Response uploadInventoryV2(JstUploadInventoryV2Request request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=3&docId=631">导入/更新虚拟库存</a>
     */
    JstBatchUpdateWmsVirtualQtysResponse batchUpdateWmsVirtualQtys(JstBatchUpdateWmsVirtualQtysRequest request);
}
