package io.github.ieu.jst.supplychainopen;

/**
 * 供应链对外开放API
 */
public interface JstSupplyChainOpenClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=648">通用资料根据父类目ID查询子类目</a>
     */
    JstQueryCategoryByPidResponse queryCategoryByPid(JstQueryCategoryByPidRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=648">通用资料根据父类目ID查询子类目</a>
     */
    JstQueryCategoryByPidSpec queryCategoryByPid();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=429">供应商价格及库存商品列表</a>
     */
    JstQueryDiserpGoodsDataResponse queryDiserpGoodsData(JstQueryDiserpGoodsDataRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=429">供应商价格及库存商品列表</a>
     */
    JstQueryDiserpGoodsDataSpec queryDiserpGoodsData();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=91">生成商品图片链接</a>
     */
    JstUploadImageToOssResponse uploadImageToOss(JstUploadImageToOssRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=91">生成商品图片链接</a>
     */
    JstUploadImageToOssSpec uploadImageToOss();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=99">批量更新商品分销状态</a>
     */
    JstBatchUpdateDistributionStatusResponse batchUpdateDistributionStatus(JstBatchUpdateDistributionStatusRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=99">批量更新商品分销状态</a>
     */
    JstBatchUpdateDistributionStatusSpec batchUpdateDistributionStatus();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=98">更新通用商品资料</a>
     */
    JstUpdateGoodsResponse updateGoods(JstUpdateGoodsRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=98">更新通用商品资料</a>
     */
    JstUpdateGoodsSpec updateGoods();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=97">查询通用商品资料列表</a>
     */
    JstQueryGoodsListResponse queryGoodsList(JstQueryGoodsListRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=97">查询通用商品资料列表</a>
     */
    JstQueryGoodsListSpec queryGoodsList();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=96">查询通用商品资料详情</a>
     */
    JstQueryGoodsDetailResponse queryGoodsDetail(JstQueryGoodsDetailRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=96">查询通用商品资料详情</a>
     */
    JstQueryGoodsDetailSpec queryGoodsDetail();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=95">添加通用商品资料</a>
     */
    JstAddGoodsResponse addGoods(JstAddGoodsRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=95">添加通用商品资料</a>
     */
    JstAddGoodsSpec addGoods();

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=94">查询OSS授权信息</a>
     */
    JstQueryOssSignatureResponse queryOssSignature(JstQueryOssSignatureRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=94">查询OSS授权信息</a>
     */
    JstQueryOssSignatureSpec queryOssSignature();
}
