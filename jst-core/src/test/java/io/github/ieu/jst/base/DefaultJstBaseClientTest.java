package io.github.ieu.jst.base;

import io.github.ieu.jst.DateTimeConversion;
import io.github.ieu.jst.JstEndpoint;
import io.github.ieu.jst.JstEnvironment;
import io.github.ieu.jst.RequestHelper;
import io.github.ieu.jst.base.model.LogisticsCompany;
import io.github.ieu.jst.base.model.LogisticsCompanyQueryParam;
import io.github.ieu.jst.base.model.Shop;
import io.github.ieu.jst.base.model.Warehouse;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;

public class DefaultJstBaseClientTest {
    private final JstEndpoint jstEndpoint = new JstEndpoint();
    /**
     * @see <a href="https://open.jushuitan.com/document/10.html">https://open.jushuitan.com/document/10.html</a>
     */
    private final RequestHelper requestHelper = new RequestHelper(
            "ywv5jGT8ge6Pvlq3FZSPol345asd",
            "ywv5jGT8ge6Pvlq3FZSPol2323",
            "181ee8952a88f5a57db52587472c3798",
            jstEndpoint.get(JstEnvironment.SANDBOX)
    );
    private DefaultJstBaseClient baseClient = new DefaultJstBaseClient(requestHelper);

    @Test
    public void testQueryShops() {
        List<Shop> shops = baseClient.queryShops(Collections.emptyList());
        assertNotNull(shops);
        assertFalse(shops.isEmpty());

        shops = baseClient.queryShops(Collections.singletonList("fMUwlAc0HDdK4P67scXt"));
        assertNotNull(shops);
        assertTrue(shops.isEmpty());

        shops = baseClient.queryShops(Collections.singletonList("大汉旗舰店"));
        assertNotNull(shops);
        assertFalse(shops.isEmpty());
        for (Shop shop : shops) {
            assertEquals(shop.getNick(), "大汉旗舰店");
        }
    }

    @Test
    public void testQueryLogisticsCompany() {
        List<LogisticsCompany> logisticsCompanies = baseClient.queryLogisticsCompany();
        assertNotNull(logisticsCompanies);
        assertFalse(logisticsCompanies.isEmpty());

        ZonedDateTime modifiedBegin = ZonedDateTime.of(
                LocalDateTime.of(
                        LocalDate.of(2015, 1, 1),
                        LocalTime.of(0, 0, 0)
                ),
                DateTimeConversion.TIMEZONE
        );

        ZonedDateTime modifiedEnd = ZonedDateTime.of(
                LocalDateTime.of(
                        LocalDate.of(2016, 1, 1),
                        LocalTime.of(0, 0, 0)
                ),
                DateTimeConversion.TIMEZONE
        );
        LogisticsCompanyQueryParam queryParam = LogisticsCompanyQueryParam.builder()
                .modifiedBegin(modifiedBegin)
                .modifiedEnd(modifiedEnd)
                .pageIndex(1)
                .pageSize(30)
                .build();
        logisticsCompanies = baseClient.queryLogisticsCompany(queryParam);
        assertNotNull(logisticsCompanies);
        assertFalse(logisticsCompanies.isEmpty());
        for (LogisticsCompany logisticsCompany : logisticsCompanies) {
            ZonedDateTime modified = logisticsCompany.getModified();
            assertTrue(modified.isAfter(modifiedBegin));
            assertTrue(modified.isBefore(modifiedEnd));
        }
    }

    @Test
    public void testQueryPartnerWms() {
        List<Warehouse> warehouses = baseClient.queryPartnerWms();
        assertNotNull(warehouses);
        assertFalse(warehouses.isEmpty());
    }

    @Test
    public void testRefreshToken() {
        ZonedDateTime expiresAt = baseClient.refreshToken();
        assertNotNull(expiresAt);
    }
}