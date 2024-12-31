package io.github.ieu.jst.item;

/**
 * 商品API
 */
public interface JstItemClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=449">商品多供应商查询</a>
     */
    JstGetSupplierSkuListResponse getSupplierSkuList(JstGetSupplierSkuListRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=449">商品多供应商查询</a>
     */
    JstGetSupplierSkuListSpec getSupplierSkuList();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=683">更新商品库容信息</a>
     */
    JstSetSkuBinsResponse setSkuBins(java.util.List<JstSetSkuBinsRequest> request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=683">更新商品库容信息</a>
     */
    JstSetSkuBinsSpec setSkuBins();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=600">商品历史成本价上传</a>
     */
    JstUploadItemSkuCostPriceResponse uploadItemSkuCostPrice(JstUploadItemSkuCostPriceRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=600">商品历史成本价上传</a>
     */
    JstUploadItemSkuCostPriceSpec uploadItemSkuCostPrice();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=495">BOM信息上传</a>
     */
    JstSaveBomResponse saveBom(JstSaveBomRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=495">BOM信息上传</a>
     */
    JstSaveBomSpec saveBom();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=486">商品类目上传/更新</a>
     */
    JstAddOrUpdateCategoryResponse addOrUpdateCategory(JstAddOrUpdateCategoryRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=486">商品类目上传/更新</a>
     */
    JstAddOrUpdateCategorySpec addOrUpdateCategory();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=483">新增/修改商品多供应商</a>
     */
    JstSaveSupplierSkuResponse saveSupplierSku(JstSaveSupplierSkuRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=483">新增/修改商品多供应商</a>
     */
    JstSaveSupplierSkuSpec saveSupplierSku();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=4">普通商品资料上传</a>
     */
    JstUploadItemSkuResponse uploadItemSku(JstUploadItemSkuRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=4">普通商品资料上传</a>
     */
    JstUploadItemSkuSpec uploadItemSku();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=428">获取商品历史成本价</a>
     */
    JstGetHistoryCostPriceV2Response getHistoryCostPriceV2(JstGetHistoryCostPriceV2Request request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=428">获取商品历史成本价</a>
     */
    JstGetHistoryCostPriceV2Spec getHistoryCostPriceV2();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=358">商品BOM信息查询</a>
     */
    JstGetSkuBomPageListResponse getSkuBomPageList(JstGetSkuBomPageListRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=358">商品BOM信息查询</a>
     */
    JstGetSkuBomPageListSpec getSkuBomPageList();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=65">组合装商品上传（批量上传）</a>
     */
    JstUploadCombineSkuResponse uploadCombineSku(JstUploadCombineSkuRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=65">组合装商品上传（批量上传）</a>
     */
    JstUploadCombineSkuSpec uploadCombineSku();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=14">普通商品资料查询（按sku查询）</a>
     */
    JstQuerySkuResponse querySku(JstQuerySkuRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=14">普通商品资料查询（按sku查询）</a>
     */
    JstQuerySkuSpec querySku();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=13">普通商品查询（按款查询）</a>
     */
    JstQueryMallItemResponse queryMallItem(JstQueryMallItemRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=13">普通商品查询（按款查询）</a>
     */
    JstQueryMallItemSpec queryMallItem();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=12">商品类目查询</a>
     */
    JstQueryCategoryResponse queryCategory(JstQueryCategoryRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=12">商品类目查询</a>
     */
    JstQueryCategorySpec queryCategory();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=11">组合装商品查询</a>
     */
    JstQueryCombineSkuResponse queryCombineSku(JstQueryCombineSkuRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=11">组合装商品查询</a>
     */
    JstQueryCombineSkuSpec queryCombineSku();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=10">店铺商品资料查询</a>
     */
    JstQuerySkuMapResponse querySkuMap(JstQuerySkuMapRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=10">店铺商品资料查询</a>
     */
    JstQuerySkuMapSpec querySkuMap();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=5">店铺商品资料上传</a>
     */
    JstUploadSkuMapResponse uploadSkuMap(JstUploadSkuMapRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=5">店铺商品资料上传</a>
     */
    JstUploadSkuMapSpec uploadSkuMap();
}
