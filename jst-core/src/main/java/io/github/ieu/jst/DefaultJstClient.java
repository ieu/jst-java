package io.github.ieu.jst;

import io.github.ieu.jst.aftersale.DefaultJstAfterSaleClient;
import io.github.ieu.jst.aftersale.JstAfterSaleClient;
import io.github.ieu.jst.allocate.DefaultJstAllocateClient;
import io.github.ieu.jst.allocate.JstAllocateClient;
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

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultJstClient implements JstClient {
    private final Map<Class<?>, Object> clientCache = new ConcurrentHashMap<>();

    private final JstConfiguration configuration;

    public DefaultJstClient(JstConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public JstBaseClient base() {
        return (JstBaseClient) clientCache.computeIfAbsent(
                JstBaseClient.class,
                k -> new DefaultJstBaseClient(configuration)
        );
    }

    @Override
    public JstItemClient item() {
        return (JstItemClient) clientCache.computeIfAbsent(
                JstItemClient.class,
                k -> new DefaultJstItemClient(configuration)
        );
    }

    @Override
    public JstInventoryClient inventory() {
        return (JstInventoryClient) clientCache.computeIfAbsent(
                JstInventoryClient.class,
                k -> new DefaultJstInventoryClient(configuration)
        );
    }

    @Override
    public JstOrderClient order() {
        return (JstOrderClient) clientCache.computeIfAbsent(
                JstOrderClient.class,
                k -> new DefaultJstOrderClient(configuration)
        );
    }

    @Override
    public JstLogisticsClient logistics() {
        return (JstLogisticsClient) clientCache.computeIfAbsent(
                JstLogisticsClient.class,
                k -> new DefaultJstLogisticsClient(configuration)
        );
    }

    @Override
    public JstPurchaseClient purchase() {
        return (JstPurchaseClient) clientCache.computeIfAbsent(
                JstPurchaseClient.class,
                k -> new DefaultJstPurchaseClient(configuration)
        );
    }

    @Override
    public JstStockInClient stockIn() {
        return (JstStockInClient) clientCache.computeIfAbsent(
                JstStockInClient.class,
                k -> new DefaultJstStockInClient(configuration)
        );
    }

    @Override
    public JstStockOutClient stockOut() {
        return (JstStockOutClient) clientCache.computeIfAbsent(
                JstStockOutClient.class,
                k -> new DefaultJstStockOutClient(configuration)
        );
    }

    @Override
    public JstAfterSaleClient afterSale() {
        return (JstAfterSaleClient) clientCache.computeIfAbsent(
                JstAfterSaleClient.class,
                k -> new DefaultJstAfterSaleClient(configuration)
        );
    }

    @Override
    public JstOtherStockingClient otherStocking() {
        return (JstOtherStockingClient) clientCache.computeIfAbsent(
                JstOtherStockingClient.class,
                k -> new DefaultJstOtherStockingClient(configuration)
        );
    }

    @Override
    public JstAllocateClient allocate() {
        return (JstAllocateClient) clientCache.computeIfAbsent(
                JstAllocateClient.class,
                k -> new DefaultJstAllocateClient(configuration)
        );
    }

    @Override
    public JstWarehouseClient warehouse() {
        return (JstWarehouseClient) clientCache.computeIfAbsent(
                JstWarehouseClient.class,
                k -> new DefaultJstWarehouseClient(configuration)
        );
    }

    @Override
    public JstCrossBorderClient crossBorder() {
        return (JstCrossBorderClient) clientCache.computeIfAbsent(
                JstCrossBorderClient.class,
                k -> new DefaultJstCrossBorderClient(configuration)
        );
    }

    @Override
    public JstWorkOrderClient workOrder() {
        return (JstWorkOrderClient) clientCache.computeIfAbsent(
                JstWorkOrderClient.class,
                k -> new DefaultJstWorkOrderClient(configuration)
        );
    }

    @Override
    public JstFinanceClient finance() {
        return (JstFinanceClient) clientCache.computeIfAbsent(
                JstFinanceClient.class,
                k -> new DefaultJstFinanceClient(configuration)
        );
    }

    @Override
    public JstSeedClient seed() {
        return (JstSeedClient) clientCache.computeIfAbsent(
                JstSeedClient.class,
                k -> new DefaultJstSeedClient(configuration)
        );
    }

    @Override
    public JstQimenClient qimen() {
        return (JstQimenClient) clientCache.computeIfAbsent(
                JstQimenClient.class,
                k -> new DefaultJstQimenClient(configuration)
        );
    }

    @Override
    public JstShengsuanClient shengsuan() {
        return (JstShengsuanClient) clientCache.computeIfAbsent(
                JstShengsuanClient.class,
                k -> new DefaultJstShengsuanClient(configuration)
        );
    }

    @Override
    public JstSupplyChainOpenClient supplyChainOpen() {
        return (JstSupplyChainOpenClient) clientCache.computeIfAbsent(
                JstSupplyChainOpenClient.class,
                k -> new DefaultJstSupplyChainOpenClient(configuration)
        );
    }

    @Override
    public JstWmsClient wms() {
        return (JstWmsClient) clientCache.computeIfAbsent(
                JstWmsClient.class,
                k -> new DefaultJstWmsClient(configuration)
        );
    }
}
