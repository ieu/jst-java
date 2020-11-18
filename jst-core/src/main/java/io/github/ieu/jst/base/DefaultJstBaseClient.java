package io.github.ieu.jst.base;

import io.github.ieu.jst.MathUtils;
import io.github.ieu.jst.RequestHelper;
import io.github.ieu.jst.base.model.*;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

public class DefaultJstBaseClient implements JstBaseClient {
    private final RequestHelper requestHelper;

    public DefaultJstBaseClient(RequestHelper requestHelper) {
        this.requestHelper = requestHelper;
    }

    @Override
    public List<Shop> queryShops(List<String> nicks) {
        return requestHelper.request(
                "shops.query",
                Collections.singletonMap("nicks", nicks),
                ShopsQueryResult.class
        ).getShops();
    }

    @Override
    public List<Shop> queryShops() {
        return queryShops(Collections.emptyList());
    }

    @Override
    public List<LogisticsCompany> queryLogisticsCompany() {
        return queryLogisticsCompany(new LogisticsCompanyQueryParam());
    }

    @Override
    public List<LogisticsCompany> queryLogisticsCompany(LogisticsCompanyQueryParam param) {
        param.setPageIndex(Math.max(param.getPageIndex(), 1));
        param.setPageSize(MathUtils.clamp(param.getPageSize(), 0, 50));

        return requestHelper.request(
                "logisticscompany.query",
                param,
                LogisticsCompanyQueryResult.class
        ).getDatas();
    }

    @Override
    public List<Warehouse> queryPartnerWms() {
        return requestHelper.request(
                "wms.partner.query",
                Collections.emptyMap(),
                WmsPartnerQueryResult.class
        ).getDatas();
    }

    @Override
    public ZonedDateTime refreshToken() {
        return requestHelper.request(
                "refresh.token",
                Collections.emptyMap(),
                RefreshTokenResult.class
        ).getData().getExpiredDate();
    }
}
