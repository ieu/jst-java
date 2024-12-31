package io.github.ieu.jst.item;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstErrorCode;
import io.github.ieu.jst.JstServerException;

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
        JstGetSupplierSkuListResponse response = execute("/open/webapi/itemapi/suppliersku/getsupplierskulist", request, JstGetSupplierSkuListResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=449">商品多供应商查询</a>
     */
    @Override
    public JstGetSupplierSkuListSpec getSupplierSkuList() {
        return new JstGetSupplierSkuListSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=683">更新商品库容信息</a>
     */
    @Override
    public JstSetSkuBinsResponse setSkuBins(java.util.List<JstSetSkuBinsRequest> request) {
        JstSetSkuBinsResponse response = execute("/open/webapi/itemapi/itemsku/setskubins", request, JstSetSkuBinsResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=683">更新商品库容信息</a>
     */
    @Override
    public JstSetSkuBinsSpec setSkuBins() {
        return new JstSetSkuBinsSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=600">商品历史成本价上传</a>
     */
    @Override
    public JstUploadItemSkuCostPriceResponse uploadItemSkuCostPrice(JstUploadItemSkuCostPriceRequest request) {
        JstUploadItemSkuCostPriceResponse response = execute("/open/jushuitan/itemsku/costprice/upload", request, JstUploadItemSkuCostPriceResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=600">商品历史成本价上传</a>
     */
    @Override
    public JstUploadItemSkuCostPriceSpec uploadItemSkuCostPrice() {
        return new JstUploadItemSkuCostPriceSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=495">BOM信息上传</a>
     */
    @Override
    public JstSaveBomResponse saveBom(JstSaveBomRequest request) {
        JstSaveBomResponse response = execute("/open/webapi/itemapi/bom/save", request, JstSaveBomResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=495">BOM信息上传</a>
     */
    @Override
    public JstSaveBomSpec saveBom() {
        return new JstSaveBomSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=486">商品类目上传/更新</a>
     */
    @Override
    public JstAddOrUpdateCategoryResponse addOrUpdateCategory(JstAddOrUpdateCategoryRequest request) {
        JstAddOrUpdateCategoryResponse response = execute("/open/webapi/itemapi/category/addorupdate", request, JstAddOrUpdateCategoryResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=486">商品类目上传/更新</a>
     */
    @Override
    public JstAddOrUpdateCategorySpec addOrUpdateCategory() {
        return new JstAddOrUpdateCategorySpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=483">新增/修改商品多供应商</a>
     */
    @Override
    public JstSaveSupplierSkuResponse saveSupplierSku(JstSaveSupplierSkuRequest request) {
        JstSaveSupplierSkuResponse response = execute("/open/webapi/itemapi/suppliersku/save", request, JstSaveSupplierSkuResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=483">新增/修改商品多供应商</a>
     */
    @Override
    public JstSaveSupplierSkuSpec saveSupplierSku() {
        return new JstSaveSupplierSkuSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=4">普通商品资料上传</a>
     */
    @Override
    public JstUploadItemSkuResponse uploadItemSku(JstUploadItemSkuRequest request) {
        JstUploadItemSkuResponse response = execute("/open/jushuitan/itemsku/upload", request, JstUploadItemSkuResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=4">普通商品资料上传</a>
     */
    @Override
    public JstUploadItemSkuSpec uploadItemSku() {
        return new JstUploadItemSkuSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=428">获取商品历史成本价</a>
     */
    @Override
    public JstGetHistoryCostPriceV2Response getHistoryCostPriceV2(JstGetHistoryCostPriceV2Request request) {
        JstGetHistoryCostPriceV2Response response = execute("/open/webapi/itemapi/itemsku/gethistorycostpricev2", request, JstGetHistoryCostPriceV2Response.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=428">获取商品历史成本价</a>
     */
    @Override
    public JstGetHistoryCostPriceV2Spec getHistoryCostPriceV2() {
        return new JstGetHistoryCostPriceV2Spec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=358">商品BOM信息查询</a>
     */
    @Override
    public JstGetSkuBomPageListResponse getSkuBomPageList(JstGetSkuBomPageListRequest request) {
        JstGetSkuBomPageListResponse response = execute("/open/webapi/itemapi/bom/getskubompagelist", request, JstGetSkuBomPageListResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=358">商品BOM信息查询</a>
     */
    @Override
    public JstGetSkuBomPageListSpec getSkuBomPageList() {
        return new JstGetSkuBomPageListSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=65">组合装商品上传（批量上传）</a>
     */
    @Override
    public JstUploadCombineSkuResponse uploadCombineSku(JstUploadCombineSkuRequest request) {
        JstUploadCombineSkuResponse response = execute("/open/item/combinesku/upload", request, JstUploadCombineSkuResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=65">组合装商品上传（批量上传）</a>
     */
    @Override
    public JstUploadCombineSkuSpec uploadCombineSku() {
        return new JstUploadCombineSkuSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=14">普通商品资料查询（按sku查询）</a>
     */
    @Override
    public JstQuerySkuResponse querySku(JstQuerySkuRequest request) {
        JstQuerySkuResponse response = execute("/open/sku/query", request, JstQuerySkuResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=14">普通商品资料查询（按sku查询）</a>
     */
    @Override
    public JstQuerySkuSpec querySku() {
        return new JstQuerySkuSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=13">普通商品查询（按款查询）</a>
     */
    @Override
    public JstQueryMallItemResponse queryMallItem(JstQueryMallItemRequest request) {
        JstQueryMallItemResponse response = execute("/open/mall/item/query", request, JstQueryMallItemResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=13">普通商品查询（按款查询）</a>
     */
    @Override
    public JstQueryMallItemSpec queryMallItem() {
        return new JstQueryMallItemSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=12">商品类目查询</a>
     */
    @Override
    public JstQueryCategoryResponse queryCategory(JstQueryCategoryRequest request) {
        JstQueryCategoryResponse response = execute("/open/category/query", request, JstQueryCategoryResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=12">商品类目查询</a>
     */
    @Override
    public JstQueryCategorySpec queryCategory() {
        return new JstQueryCategorySpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=11">组合装商品查询</a>
     */
    @Override
    public JstQueryCombineSkuResponse queryCombineSku(JstQueryCombineSkuRequest request) {
        JstQueryCombineSkuResponse response = execute("/open/combine/sku/query", request, JstQueryCombineSkuResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=11">组合装商品查询</a>
     */
    @Override
    public JstQueryCombineSkuSpec queryCombineSku() {
        return new JstQueryCombineSkuSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=10">店铺商品资料查询</a>
     */
    @Override
    public JstQuerySkuMapResponse querySkuMap(JstQuerySkuMapRequest request) {
        JstQuerySkuMapResponse response = execute("/open/skumap/query", request, JstQuerySkuMapResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=10">店铺商品资料查询</a>
     */
    @Override
    public JstQuerySkuMapSpec querySkuMap() {
        return new JstQuerySkuMapSpec(this);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=5">店铺商品资料上传</a>
     */
    @Override
    public JstUploadSkuMapResponse uploadSkuMap(JstUploadSkuMapRequest request) {
        JstUploadSkuMapResponse response = execute("/open/jushuitan/skumap/upload", request, JstUploadSkuMapResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=2&docId=5">店铺商品资料上传</a>
     */
    @Override
    public JstUploadSkuMapSpec uploadSkuMap() {
        return new JstUploadSkuMapSpec(this);
    }
}
