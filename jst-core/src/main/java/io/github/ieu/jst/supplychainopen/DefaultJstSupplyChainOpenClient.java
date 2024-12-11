package io.github.ieu.jst.supplychainopen;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstErrorCode;
import io.github.ieu.jst.JstServerException;

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
        JstQueryCategoryByPidResponse response = execute("/open/api/goods/inneropen/category/querycategorybypid", request, JstQueryCategoryByPidResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=429">供应商价格及库存商品列表</a>
     */
    @Override
    public JstQueryDiserpGoodsDataResponse queryDiserpGoodsData(JstQueryDiserpGoodsDataRequest request) {
        JstQueryDiserpGoodsDataResponse response = execute("/open/api/goods/inneropen/supplier/goods/querydiserpgoodsdata", request, JstQueryDiserpGoodsDataResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=91">生成商品图片链接</a>
     */
    @Override
    public JstUploadImageToOssResponse uploadImageToOss(JstUploadImageToOssRequest request) {
        JstUploadImageToOssResponse response = execute("/open/api/goods/inneropen/oss/uploadimage", request, JstUploadImageToOssResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=99">批量更新商品分销状态</a>
     */
    @Override
    public JstBatchUpdateDistributionStatusResponse batchUpdateDistributionStatus(JstBatchUpdateDistributionStatusRequest request) {
        JstBatchUpdateDistributionStatusResponse response = execute("/open/api/goods/inneropen/goods/batchupdatedistributionstatus", request, JstBatchUpdateDistributionStatusResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=98">更新通用商品资料</a>
     */
    @Override
    public JstUpdateGoodsResponse updateGoods(JstUpdateGoodsRequest request) {
        JstUpdateGoodsResponse response = execute("/open/api/goods/inneropen/goods/updategoods", request, JstUpdateGoodsResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=97">查询通用商品资料列表</a>
     */
    @Override
    public JstQueryGoodsListResponse queryGoodsList(JstQueryGoodsListRequest request) {
        JstQueryGoodsListResponse response = execute("/open/api/goods/inneropen/goods/querygoodslist", request, JstQueryGoodsListResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=96">查询通用商品资料详情</a>
     */
    @Override
    public JstQueryGoodsDetailResponse queryGoodsDetail(JstQueryGoodsDetailRequest request) {
        JstQueryGoodsDetailResponse response = execute("/open/api/goods/inneropen/goods/querygoodsdetail", request, JstQueryGoodsDetailResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=95">添加通用商品资料</a>
     */
    @Override
    public JstAddGoodsResponse addGoods(JstAddGoodsRequest request) {
        JstAddGoodsResponse response = execute("/open/api/goods/inneropen/goods/addgoods", request, JstAddGoodsResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=28&docId=94">查询OSS授权信息</a>
     */
    @Override
    public JstQueryOssSignatureResponse queryOssSignature(JstQueryOssSignatureRequest request) {
        JstQueryOssSignatureResponse response = execute("/open/api/goods/inneropen/oss/queryosssignature", request, JstQueryOssSignatureResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }
}
