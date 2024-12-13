package io.github.ieu.jst;

import io.github.ieu.jst.aftersale.JstAfterSaleClient;
import io.github.ieu.jst.allocate.JstAllocateClient;
import io.github.ieu.jst.auth.JstAuthClient;
import io.github.ieu.jst.base.JstBaseClient;
import io.github.ieu.jst.crossborder.JstCrossBorderClient;
import io.github.ieu.jst.finance.JstFinanceClient;
import io.github.ieu.jst.inventory.JstInventoryClient;
import io.github.ieu.jst.item.JstItemClient;
import io.github.ieu.jst.logistics.JstLogisticsClient;
import io.github.ieu.jst.order.JstOrderClient;
import io.github.ieu.jst.otherstocking.JstOtherStockingClient;
import io.github.ieu.jst.purchase.JstPurchaseClient;
import io.github.ieu.jst.qimen.JstQimenClient;
import io.github.ieu.jst.seed.JstSeedClient;
import io.github.ieu.jst.shengsuan.JstShengsuanClient;
import io.github.ieu.jst.stockin.JstStockInClient;
import io.github.ieu.jst.stockout.JstStockOutClient;
import io.github.ieu.jst.supplychainopen.JstSupplyChainOpenClient;
import io.github.ieu.jst.warehouse.JstWarehouseClient;
import io.github.ieu.jst.wms.JstWmsClient;
import io.github.ieu.jst.workorder.JstWorkOrderClient;

public interface JstClient {
    /**
     * 基础API
     */
    JstBaseClient base();

    /**
     * 商品API
     */
    JstItemClient item();

    /**
     * 库存API
     */
    JstInventoryClient inventory();

    /**
     * 订单API
     */
    JstOrderClient order();

    /**
     * 物流API
     */
    JstLogisticsClient logistics();

    /**
     * 采购API
     */
    JstPurchaseClient purchase();

    /**
     * 入库API
     */
    JstStockInClient stockIn();

    /**
     * 出库API
     */
    JstStockOutClient stockOut();

    /**
     * 售后API
     */
    JstAfterSaleClient afterSale();

    /**
     * 其它出入库API
     */
    JstOtherStockingClient otherStocking();

    /**
     * 调拨API
     */
    JstAllocateClient allocate();

    /**
     * 虚拟仓API
     */
    JstWarehouseClient warehouse();

    /**
     * 跨境API
     */
    JstCrossBorderClient crossBorder();

    /**
     * 聚工单开放API
     */
    JstWorkOrderClient workOrder();

    /**
     * 财务API
     */
    JstFinanceClient finance();

    /**
     * 播种API
     */
    JstSeedClient seed();

    /**
     * 奇门API
     */
    JstQimenClient qimen();

    /**
     * 胜算API
     */
    JstShengsuanClient shengsuan();

    /**
     * 供应链对外开放API
     */
    JstSupplyChainOpenClient supplyChainOpen();

    /**
     * WMS API
     */
    JstWmsClient wms();

    /**
     * 授权API
     */
    JstAuthClient auth();
}
