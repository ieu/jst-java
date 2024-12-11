package io.github.ieu.jst;

import io.github.ieu.jst.aftersale.DefaultJstAfterSaleClient;
import io.github.ieu.jst.aftersale.JstAfterSaleClient;
import io.github.ieu.jst.allocate.DefaultJstAllocateClient;
import io.github.ieu.jst.allocate.JstAllocateClient;
import io.github.ieu.jst.auth.JstTokenStore;
import io.github.ieu.jst.base.DefaultJstBaseClient;
import io.github.ieu.jst.base.JstBaseClient;
import io.github.ieu.jst.crossborder.DefaultJstCrossBorderClient;
import io.github.ieu.jst.crossborder.JstCrossBorderClient;
import io.github.ieu.jst.finance.DefaultJstFinanceClient;
import io.github.ieu.jst.finance.JstFinanceClient;
import io.github.ieu.jst.inventory.DefaultJstInventoryClient;
import io.github.ieu.jst.inventory.JstInventoryClient;
import io.github.ieu.jst.item.DefaultJstItemClient;
import io.github.ieu.jst.item.JstItemClient;
import io.github.ieu.jst.logistics.DefaultJstLogisticsClient;
import io.github.ieu.jst.logistics.JstLogisticsClient;
import io.github.ieu.jst.order.DefaultJstOrderClient;
import io.github.ieu.jst.order.JstOrderClient;
import io.github.ieu.jst.otherstocking.DefaultJstOtherStockingClient;
import io.github.ieu.jst.otherstocking.JstOtherStockingClient;
import io.github.ieu.jst.purchase.DefaultJstPurchaseClient;
import io.github.ieu.jst.purchase.JstPurchaseClient;
import io.github.ieu.jst.qimen.DefaultJstQimenClient;
import io.github.ieu.jst.qimen.JstQimenClient;
import io.github.ieu.jst.seed.DefaultJstSeedClient;
import io.github.ieu.jst.seed.JstSeedClient;
import io.github.ieu.jst.shengsuan.DefaultJstShengsuanClient;
import io.github.ieu.jst.shengsuan.JstShengsuanClient;
import io.github.ieu.jst.stockin.DefaultJstStockInClient;
import io.github.ieu.jst.stockin.JstStockInClient;
import io.github.ieu.jst.stockout.DefaultJstStockOutClient;
import io.github.ieu.jst.stockout.JstStockOutClient;
import io.github.ieu.jst.supplychainopen.DefaultJstSupplyChainOpenClient;
import io.github.ieu.jst.supplychainopen.JstSupplyChainOpenClient;
import io.github.ieu.jst.warehouse.DefaultJstWarehouseClient;
import io.github.ieu.jst.warehouse.JstWarehouseClient;
import io.github.ieu.jst.wms.DefaultJstWmsClient;
import io.github.ieu.jst.wms.JstWmsClient;
import io.github.ieu.jst.workorder.DefaultJstWorkOrderClient;
import io.github.ieu.jst.workorder.JstWorkOrderClient;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertSame;

class DefaultJstClientTest {

    private final JstClient client = new DefaultJstClient(
            JstConfiguration.builder()
                    .endpoint("https://dev-api.jushuitan.com")
                    .credential("b0b7d1db226d4216a3d58df9ffa2dde5", "99c4cef262f34ca882975a7064de0b87")
                    .tokenStore(new JstTokenStore() {
                        @Override
                        public Optional<String> getAccessToken(String appKey) {
                            return Optional.of("b7e3b1e24e174593af8ca5c397e53dad");
                        }

                        @Override
                        public void setAccessToken(String appKey, String accessToken, Duration expiresIn) {
                            throw new UnsupportedOperationException("setAccessToken is not implemented");
                        }

                        @Override
                        public Optional<String> getRefreshToken(String appKey) {
                            throw new UnsupportedOperationException("getRefreshToken is not implemented");
                        }

                        @Override
                        public void setRefreshToken(String appKey, String refreshToken, Duration expiresIn) {
                            throw new UnsupportedOperationException("setRefreshToken is not implemented");
                        }
                    })
                    .build()
    );

    @Test
    void base_shouldReturnSameInstance() {
        assertInstanceOf(JstBaseClient.class, client.base());
        assertInstanceOf(DefaultJstBaseClient.class, client.base());
        assertSame(client.base(), client.base());
    }

    @Test
    void item_shouldReturnSameInstance() {
        assertInstanceOf(JstItemClient.class, client.item());
        assertInstanceOf(DefaultJstItemClient.class, client.item());
        assertSame(client.item(), client.item());
    }

    @Test
    void inventory_shouldReturnSameInstance() {
        assertInstanceOf(JstInventoryClient.class, client.inventory());
        assertInstanceOf(DefaultJstInventoryClient.class, client.inventory());
        assertSame(client.inventory(), client.inventory());
    }

    @Test
    void order_shouldReturnSameInstance() {
        assertInstanceOf(JstOrderClient.class, client.order());
        assertInstanceOf(DefaultJstOrderClient.class, client.order());
        assertSame(client.order(), client.order());
    }

    @Test
    void logistics_shouldReturnSameInstance() {
        assertInstanceOf(JstLogisticsClient.class, client.logistics());
        assertInstanceOf(DefaultJstLogisticsClient.class, client.logistics());
        assertSame(client.logistics(), client.logistics());
    }

    @Test
    void purchase_shouldReturnSameInstance() {
        assertInstanceOf(JstPurchaseClient.class, client.purchase());
        assertInstanceOf(DefaultJstPurchaseClient.class, client.purchase());
        assertSame(client.purchase(), client.purchase());
    }

    @Test
    void stockIn_shouldReturnSameInstance() {
        assertInstanceOf(JstStockInClient.class, client.stockIn());
        assertInstanceOf(DefaultJstStockInClient.class, client.stockIn());
        assertSame(client.stockIn(), client.stockIn());
    }

    @Test
    void stockOut_shouldReturnSameInstance() {
        assertInstanceOf(JstStockOutClient.class, client.stockOut());
        assertInstanceOf(DefaultJstStockOutClient.class, client.stockOut());
        assertSame(client.stockOut(), client.stockOut());
    }

    @Test
    void afterSale_shouldReturnSameInstance() {
        assertInstanceOf(JstAfterSaleClient.class, client.afterSale());
        assertInstanceOf(DefaultJstAfterSaleClient.class, client.afterSale());
        assertSame(client.afterSale(), client.afterSale());
    }

    @Test
    void otherStocking_shouldReturnSameInstance() {
        assertInstanceOf(JstOtherStockingClient.class, client.otherStocking());
        assertInstanceOf(DefaultJstOtherStockingClient.class, client.otherStocking());
        assertSame(client.otherStocking(), client.otherStocking());
    }

    @Test
    void allocate_shouldReturnSameInstance() {
        assertInstanceOf(JstAllocateClient.class, client.allocate());
        assertInstanceOf(DefaultJstAllocateClient.class, client.allocate());
        assertSame(client.allocate(), client.allocate());
    }

    @Test
    void warehouse_shouldReturnSameInstance() {
        assertInstanceOf(JstWarehouseClient.class, client.warehouse());
        assertInstanceOf(DefaultJstWarehouseClient.class, client.warehouse());
        assertSame(client.warehouse(), client.warehouse());
    }

    @Test
    void crossBorder_shouldReturnSameInstance() {
        assertInstanceOf(JstCrossBorderClient.class, client.crossBorder());
        assertInstanceOf(DefaultJstCrossBorderClient.class, client.crossBorder());
        assertSame(client.crossBorder(), client.crossBorder());
    }

    @Test
    void workOrder_shouldReturnSameInstance() {
        assertInstanceOf(JstWorkOrderClient.class, client.workOrder());
        assertInstanceOf(DefaultJstWorkOrderClient.class, client.workOrder());
        assertSame(client.workOrder(), client.workOrder());
    }

    @Test
    void finance_shouldReturnSameInstance() {
        assertInstanceOf(JstFinanceClient.class, client.finance());
        assertInstanceOf(DefaultJstFinanceClient.class, client.finance());
        assertSame(client.finance(), client.finance());
    }

    @Test
    void seed_shouldReturnSameInstance() {
        assertInstanceOf(JstSeedClient.class, client.seed());
        assertInstanceOf(DefaultJstSeedClient.class, client.seed());
        assertSame(client.seed(), client.seed());
    }

    @Test
    void qimen_shouldReturnSameInstance() {
        assertInstanceOf(JstQimenClient.class, client.qimen());
        assertInstanceOf(DefaultJstQimenClient.class, client.qimen());
        assertSame(client.qimen(), client.qimen());
    }

    @Test
    void shengsuan_shouldReturnSameInstance() {
        assertInstanceOf(JstShengsuanClient.class, client.shengsuan());
        assertInstanceOf(DefaultJstShengsuanClient.class, client.shengsuan());
        assertSame(client.shengsuan(), client.shengsuan());
    }

    @Test
    void supplyChainOpen_shouldReturnSameInstance() {
        assertInstanceOf(JstSupplyChainOpenClient.class, client.supplyChainOpen());
        assertInstanceOf(DefaultJstSupplyChainOpenClient.class, client.supplyChainOpen());
        assertSame(client.supplyChainOpen(), client.supplyChainOpen());
    }

    @Test
    void wms_shouldReturnSameInstance() {
        assertInstanceOf(JstWmsClient.class, client.wms());
        assertInstanceOf(DefaultJstWmsClient.class, client.wms());
        assertSame(client.wms(), client.wms());
    }
}