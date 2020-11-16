package io.github.ieu.jst.base;

import io.github.ieu.jst.base.model.LogisticsCompany;
import io.github.ieu.jst.base.model.LogisticsCompanyQueryParam;
import io.github.ieu.jst.base.model.Shop;
import io.github.ieu.jst.base.model.Warehouse;

import java.time.ZonedDateTime;
import java.util.List;

public interface JstBaseClient {
    /**
     * 店铺查询
     *
     * @param nicks 店铺主账号，不支持模糊查询
     * @see <a href="https://open.jushuitan.com/document/14.html">https://open.jushuitan.com/document/14.html</a>
     */
    List<Shop> queryShops(List<String> nicks);

    /**
     * 店铺查询
     */
    List<Shop> queryShops();

    /**
     * 物流公司查询
     */
    List<LogisticsCompany> queryLogisticsCompany();

    /**
     * 物流公司查询
     *
     * @param queryParam 查询参数
     * @see <a href="https://open.jushuitan.com/document/2036.html">https://open.jushuitan.com/document/2036.html</a>
     */
    List<LogisticsCompany> queryLogisticsCompany(LogisticsCompanyQueryParam queryParam);

    /**
     * 分仓查询
     * <p>
     * wms.partner.query
     *
     * @see <a href="https://open.jushuitan.com/document/2064.html">https://open.jushuitan.com/document/2064.html</a>
     */
    List<Warehouse> queryPartnerWms();

    /**
     * 刷新token
     *
     * @return 有效期
     * @see <a href="https://open.jushuitan.com/document/2064.html">https://open.jushuitan.com/document/2064.html</a>
     */
    ZonedDateTime refreshToken();
}
