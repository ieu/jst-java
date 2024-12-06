package io.github.ieu.jst.base;

import io.github.ieu.jst.AbstractJstBizClient;
import io.github.ieu.jst.JstConfiguration;

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
        return execute("/open/shops/query", request, JstQueryShopsResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=2">物流公司查询</a>
     */
    @Override
    public JstQueryLogisticsCompanyResponse queryLogisticsCompany(JstQueryLogisticsCompanyRequest request) {
        return execute("/open/logisticscompany/query", request, JstQueryLogisticsCompanyResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=3">仓库查询</a>
     */
    @Override
    public JstQueryWmsPartnerResponse queryWmsPartner(JstQueryWmsPartnerRequest request) {
        return execute("/open/wms/partner/query", request, JstQueryWmsPartnerResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=430">供销商查询</a>
     */
    @Override
    public JstQueryMySupplierByPartnerChannelResponse queryMySupplierByPartnerChannel(JstQueryMySupplierByPartnerChannelRequest request) {
        return execute("/open/api/company/inneropen/partner/channel/querymysupplier", request, JstQueryMySupplierByPartnerChannelResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=611">商家用户信息</a>
     */
    @Override
    public JstGetCompanyUsersResponse getCompanyUsers(JstGetCompanyUsersRequest request) {
        return execute("/open/webapi/userapi/company/getcompanyusers", request, JstGetCompanyUsersResponse.class);
    }

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=955">分销商查询</a>
     */
    @Override
    public JstQueryMyChannelBySupplierResponse queryMyChannelBySupplier(JstQueryMyChannelBySupplierRequest request) {
        return execute("/open/api/drp/inneropen/partner/supplier/querymychannel", request, JstQueryMyChannelBySupplierResponse.class);
    }
}
