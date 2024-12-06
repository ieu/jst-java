package io.github.ieu.jst.supplychainopen;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

/**
 * 供应链对外开放API
 */
public class DefaultJstSupplyChainOpenClient extends AbstractJstBizClient implements JstSupplyChainOpenClient {

    public DefaultJstSupplyChainOpenClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=648">通用资料根据父类目ID查询子类目</a>
     */
    @Override
    public JstQueryCategoryByPidResponse queryCategoryByPid(JstQueryCategoryByPidRequest request) {
        return execute("/open/api/goods/inneropen/category/querycategorybypid", request, JstQueryCategoryByPidResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=429">供应商价格及库存商品列表</a>
     */
    @Override
    public JstQueryDiserpGoodsDataResponse queryDiserpGoodsData(JstQueryDiserpGoodsDataRequest request) {
        return execute("/open/api/goods/inneropen/supplier/goods/querydiserpgoodsdata", request, JstQueryDiserpGoodsDataResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=91">生成商品图片链接</a>
     */
    @Override
    public JstUploadImageToOssResponse uploadImageToOss(JstUploadImageToOssRequest request) {
        return execute("/open/api/goods/inneropen/oss/uploadimage", request, JstUploadImageToOssResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=99">批量更新商品分销状态</a>
     */
    @Override
    public JstBatchUpdateDistributionStatusResponse batchUpdateDistributionStatus(JstBatchUpdateDistributionStatusRequest request) {
        return execute("/open/api/goods/inneropen/goods/batchupdatedistributionstatus", request, JstBatchUpdateDistributionStatusResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=98">更新通用商品资料</a>
     */
    @Override
    public JstUpdateGoodsResponse updateGoods(JstUpdateGoodsRequest request) {
        return execute("/open/api/goods/inneropen/goods/updategoods", request, JstUpdateGoodsResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=97">查询通用商品资料列表</a>
     */
    @Override
    public JstQueryGoodsListResponse queryGoodsList(JstQueryGoodsListRequest request) {
        return execute("/open/api/goods/inneropen/goods/querygoodslist", request, JstQueryGoodsListResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=96">查询通用商品资料详情</a>
     */
    @Override
    public JstQueryGoodsDetailResponse queryGoodsDetail(JstQueryGoodsDetailRequest request) {
        return execute("/open/api/goods/inneropen/goods/querygoodsdetail", request, JstQueryGoodsDetailResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=95">添加通用商品资料</a>
     */
    @Override
    public JstAddGoodsResponse addGoods(JstAddGoodsRequest request) {
        return execute("/open/api/goods/inneropen/goods/addgoods", request, JstAddGoodsResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=94">查询OSS授权信息</a>
     */
    @Override
    public JstQueryOssSignatureResponse queryOssSignature(JstQueryOssSignatureRequest request) {
        return execute("/open/api/goods/inneropen/oss/queryosssignature", request, JstQueryOssSignatureResponse.class);
    }
}
