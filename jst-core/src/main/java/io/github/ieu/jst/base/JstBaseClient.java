package io.github.ieu.jst.base;

/**
 * 基础API
 */
public interface JstBaseClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=1">店铺查询</a>
     */
    JstQueryShopsResponse queryShops(JstQueryShopsRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=2">物流公司查询</a>
     */
    JstQueryLogisticsCompanyResponse queryLogisticsCompany(JstQueryLogisticsCompanyRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=3">仓库查询</a>
     */
    JstQueryWmsPartnerResponse queryWmsPartner(JstQueryWmsPartnerRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=430">供销商查询</a>
     */
    JstQueryMySupplierByPartnerChannelResponse queryMySupplierByPartnerChannel(JstQueryMySupplierByPartnerChannelRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=611">商家用户信息</a>
     */
    JstGetCompanyUsersResponse getCompanyUsers(JstGetCompanyUsersRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=1&docId=955">分销商查询</a>
     */
    JstQueryMyChannelBySupplierResponse queryMyChannelBySupplier(JstQueryMyChannelBySupplierRequest request);
}
