package io.github.ieu.jst.base;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;
import io.github.ieu.jst.JstErrorCode;
import io.github.ieu.jst.JstServerException;

/**
 * 基础API
 */
public class DefaultJstBaseClient extends AbstractJstBizClient implements JstBaseClient {

    public DefaultJstBaseClient(JstConfiguration configuration) {
        super(configuration);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=1">店铺查询</a>
     */
    @Override
    public JstQueryShopsResponse queryShops(JstQueryShopsRequest request) {
        JstQueryShopsResponse response = execute("/open/shops/query", request, JstQueryShopsResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=2">物流公司查询</a>
     */
    @Override
    public JstQueryLogisticsCompanyResponse queryLogisticsCompany(JstQueryLogisticsCompanyRequest request) {
        JstQueryLogisticsCompanyResponse response = execute("/open/logisticscompany/query", request, JstQueryLogisticsCompanyResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=3">仓库查询</a>
     */
    @Override
    public JstQueryWmsPartnerResponse queryWmsPartner(JstQueryWmsPartnerRequest request) {
        JstQueryWmsPartnerResponse response = execute("/open/wms/partner/query", request, JstQueryWmsPartnerResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=430">供销商查询</a>
     */
    @Override
    public JstQueryMySupplierByPartnerChannelResponse queryMySupplierByPartnerChannel(JstQueryMySupplierByPartnerChannelRequest request) {
        JstQueryMySupplierByPartnerChannelResponse response = execute("/open/api/company/inneropen/partner/channel/querymysupplier", request, JstQueryMySupplierByPartnerChannelResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=611">商家用户信息</a>
     */
    @Override
    public JstGetCompanyUsersResponse getCompanyUsers(JstGetCompanyUsersRequest request) {
        JstGetCompanyUsersResponse response = execute("/open/webapi/userapi/company/getcompanyusers", request, JstGetCompanyUsersResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=955">分销商查询</a>
     */
    @Override
    public JstQueryMyChannelBySupplierResponse queryMyChannelBySupplier(JstQueryMyChannelBySupplierRequest request) {
        JstQueryMyChannelBySupplierResponse response = execute("/open/api/drp/inneropen/partner/supplier/querymychannel", request, JstQueryMyChannelBySupplierResponse.class);
        if (!JstErrorCode.SUCCESS.is(response.getCode())) {
            throw new JstServerException(String.format("%d %s", response.getCode(), response.getMsg()));
        }
        return response;
    }
}
