package io.github.ieu.jst.item;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

/**
 * 商品API
 */
public class DefaultJstItemClient extends AbstractJstBizClient implements JstItemClient {

    public DefaultJstItemClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=449">商品多供应商查询</a>
     */
    @Override
    public JstGetSupplierSkuListResponse getSupplierSkuList(JstGetSupplierSkuListRequest request) {
        return execute("/open/webapi/itemapi/suppliersku/getsupplierskulist", request, JstGetSupplierSkuListResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=683">更新商品库容信息</a>
     */
    @Override
    public JstSetSkuBinsResponse setSkuBins(java.util.List<JstSetSkuBinsRequest> request) {
        return execute("/open/webapi/itemapi/itemsku/setskubins", request, JstSetSkuBinsResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=600">商品历史成本价上传</a>
     */
    @Override
    public JstUploadItemSkuCostPriceResponse uploadItemSkuCostPrice(JstUploadItemSkuCostPriceRequest request) {
        return execute("/open/jushuitan/itemsku/costprice/upload", request, JstUploadItemSkuCostPriceResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=495">BOM信息上传</a>
     */
    @Override
    public JstSaveBomResponse saveBom(JstSaveBomRequest request) {
        return execute("/open/webapi/itemapi/bom/save", request, JstSaveBomResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=486">商品类目上传/更新</a>
     */
    @Override
    public JstAddOrUpdateCategoryResponse addOrUpdateCategory(JstAddOrUpdateCategoryRequest request) {
        return execute("/open/webapi/itemapi/category/addorupdate", request, JstAddOrUpdateCategoryResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=483">新增/修改商品多供应商</a>
     */
    @Override
    public JstSaveSupplierSkuResponse saveSupplierSku(JstSaveSupplierSkuRequest request) {
        return execute("/open/webapi/itemapi/suppliersku/save", request, JstSaveSupplierSkuResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=4">普通商品资料上传</a>
     */
    @Override
    public JstUploadItemSkuResponse uploadItemSku(JstUploadItemSkuRequest request) {
        return execute("/open/jushuitan/itemsku/upload", request, JstUploadItemSkuResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=428">获取商品历史成本价</a>
     */
    @Override
    public JstGetHistoryCostPriceV2Response getHistoryCostPriceV2(JstGetHistoryCostPriceV2Request request) {
        return execute("/open/webapi/itemapi/itemsku/gethistorycostpricev2", request, JstGetHistoryCostPriceV2Response.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=358">商品BOM信息查询</a>
     */
    @Override
    public JstGetSkuBomPageListResponse getSkuBomPageList(JstGetSkuBomPageListRequest request) {
        return execute("/open/webapi/itemapi/bom/getskubompagelist", request, JstGetSkuBomPageListResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=65">组合装商品上传（批量上传）</a>
     */
    @Override
    public JstUploadCombineSkuResponse uploadCombineSku(JstUploadCombineSkuRequest request) {
        return execute("/open/item/combinesku/upload", request, JstUploadCombineSkuResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=14">普通商品资料查询（按sku查询）</a>
     */
    @Override
    public JstQuerySkuResponse querySku(JstQuerySkuRequest request) {
        return execute("/open/sku/query", request, JstQuerySkuResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=13">普通商品查询（按款查询）</a>
     */
    @Override
    public JstQueryMallItemResponse queryMallItem(JstQueryMallItemRequest request) {
        return execute("/open/mall/item/query", request, JstQueryMallItemResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=12">商品类目查询</a>
     */
    @Override
    public JstQueryCategoryResponse queryCategory(JstQueryCategoryRequest request) {
        return execute("/open/category/query", request, JstQueryCategoryResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=11">组合装商品查询</a>
     */
    @Override
    public JstQueryCombineSkuResponse queryCombineSku(JstQueryCombineSkuRequest request) {
        return execute("/open/combine/sku/query", request, JstQueryCombineSkuResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=10">店铺商品资料查询</a>
     */
    @Override
    public JstQuerySkuMapResponse querySkuMap(JstQuerySkuMapRequest request) {
        return execute("/open/skumap/query", request, JstQuerySkuMapResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=5">店铺商品资料上传</a>
     */
    @Override
    public JstUploadSkuMapResponse uploadSkuMap(JstUploadSkuMapRequest request) {
        return execute("/open/jushuitan/skumap/upload", request, JstUploadSkuMapResponse.class);
    }
}
