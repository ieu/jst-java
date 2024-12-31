非官方[聚水潭开放平台](https://openweb.jushuitan.com/index) SDK

## 使用方法

初始化：

```java
JstConfiguration configuration = JstConfiguration.builder()
        .endpoint("https://openapi.jushuitan.com")
        .credential("Your App Key", "Your App Secret")
        .build();
JstClient client = new DefaultJstClient(configuration);
```

方式一：

```java
JstBaseClient baseClient = client.base();
JstQueryShopsRequest request = JstQueryShopsRequest.builder()
        .shopIds(Arrays.asList(12343451, 17138865))
        .build();
JstQueryShopsResponse response = baseClient.queryShops(request);
```

方式二：

```java
JstQueryShopsResponse response = client.base()
        .queryShops()
        .shopIds(Arrays.asList(12343451, 17138865))
        .response();
```

## Spring Boot 集成

配置 `JstClient`：

```yaml
jst:
  endpoint: https://openapi.jushuitan.com
  credential:
    app-key: Your App Key
    app-secret: Your App Secret
```

自定义 `JstClient`：

```java
@Bean
public JstConfigurationBuilderCustomizer customizer() {
    return builder -> {
        builder.httpClientFactory(
                new DefaultJstHttpClientFactory()
                        .httpRequestFactory(
                                new OkHttp3JstHttpRequestFactory()
                        )
        );
    };
}
```

注入 `JstClient`：

```java
@Resource
JstClient jstClient;
```

## 接口清单

<table>
    <tr>
        <th>API</th>
        <th>接口路径</th>
        <th>接口名称</th>
        <th>方法名称</th>
    </tr>
    <tr>
        <td rowspan="6">基础API</td>
        <td>/open/shops/query</td>
        <td>店铺查询</td>
        <td>JstClient.base().queryShops()</td>
    </tr>
    <tr>
        <td>/open/logisticscompany/query</td>
        <td>物流公司查询</td>
        <td>JstClient.base().queryLogisticsCompany()</td>
    </tr>
    <tr>
        <td>/open/wms/partner/query</td>
        <td>仓库查询</td>
        <td>JstClient.base().queryWmsPartner()</td>
    </tr>
    <tr>
        <td>/open/api/company/inneropen/partner/channel/querymysupplier</td>
        <td>供销商查询</td>
        <td>JstClient.base().queryMySupplierByPartnerChannel()</td>
    </tr>
    <tr>
        <td>/open/webapi/userapi/company/getcompanyusers</td>
        <td>商家用户信息</td>
        <td>JstClient.base().getCompanyUsers()</td>
    </tr>
    <tr>
        <td>/open/api/drp/inneropen/partner/supplier/querymychannel</td>
        <td>分销商查询</td>
        <td>JstClient.base().queryMyChannelBySupplier()</td>
    </tr>
    <tr>
        <td rowspan="16">商品API</td>
        <td>/open/webapi/itemapi/suppliersku/getsupplierskulist</td>
        <td>商品多供应商查询</td>
        <td>JstClient.item().getSupplierSkuList()</td>
    </tr>
    <tr>
        <td>/open/webapi/itemapi/itemsku/setskubins</td>
        <td>更新商品库容信息</td>
        <td>JstClient.item().setSkuBins()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/itemsku/costprice/upload</td>
        <td>商品历史成本价上传</td>
        <td>JstClient.item().uploadItemSkuCostPrice()</td>
    </tr>
    <tr>
        <td>/open/webapi/itemapi/bom/save</td>
        <td>BOM信息上传</td>
        <td>JstClient.item().saveBom()</td>
    </tr>
    <tr>
        <td>/open/webapi/itemapi/category/addorupdate</td>
        <td>商品类目上传/更新</td>
        <td>JstClient.item().addOrUpdateCategory()</td>
    </tr>
    <tr>
        <td>/open/webapi/itemapi/suppliersku/save</td>
        <td>新增/修改商品多供应商</td>
        <td>JstClient.item().saveSupplierSku()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/itemsku/upload</td>
        <td>普通商品资料上传</td>
        <td>JstClient.item().uploadItemSku()</td>
    </tr>
    <tr>
        <td>/open/webapi/itemapi/itemsku/gethistorycostpricev2</td>
        <td>获取商品历史成本价</td>
        <td>JstClient.item().getHistoryCostPriceV2()</td>
    </tr>
    <tr>
        <td>/open/webapi/itemapi/bom/getskubompagelist</td>
        <td>商品BOM信息查询</td>
        <td>JstClient.item().getSkuBomPageList()</td>
    </tr>
    <tr>
        <td>/open/item/combinesku/upload</td>
        <td>组合装商品上传（批量上传）</td>
        <td>JstClient.item().uploadCombineSku()</td>
    </tr>
    <tr>
        <td>/open/sku/query</td>
        <td>普通商品资料查询（按sku查询）</td>
        <td>JstClient.item().querySku()</td>
    </tr>
    <tr>
        <td>/open/mall/item/query</td>
        <td>普通商品查询（按款查询）</td>
        <td>JstClient.item().queryMallItem()</td>
    </tr>
    <tr>
        <td>/open/category/query</td>
        <td>商品类目查询</td>
        <td>JstClient.item().queryCategory()</td>
    </tr>
    <tr>
        <td>/open/combine/sku/query</td>
        <td>组合装商品查询</td>
        <td>JstClient.item().queryCombineSku()</td>
    </tr>
    <tr>
        <td>/open/skumap/query</td>
        <td>店铺商品资料查询</td>
        <td>JstClient.item().querySkuMap()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/skumap/upload</td>
        <td>店铺商品资料上传</td>
        <td>JstClient.item().uploadSkuMap()</td>
    </tr>
    <tr>
        <td rowspan="5">库存API</td>
        <td>/open/inventory/query</td>
        <td>商品库存查询</td>
        <td>JstClient.inventory().queryInventory()</td>
    </tr>
    <tr>
        <td>/open/inventory/count/query</td>
        <td>库存盘点查询</td>
        <td>JstClient.inventory().queryInventoryCount()</td>
    </tr>
    <tr>
        <td>/open/pack/query</td>
        <td>箱及仓位库存查询</td>
        <td>JstClient.inventory().queryPack()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/inventoryv2/upload</td>
        <td>新建盘点单-修改库存</td>
        <td>JstClient.inventory().uploadInventoryV2()</td>
    </tr>
    <tr>
        <td>/open/webapi/itemapi/iteminventory/batchupdatewmsvirtualqtys</td>
        <td>导入/更新虚拟库存</td>
        <td>JstClient.inventory().batchUpdateWmsVirtualQtys()</td>
    </tr>
    <tr>
        <td rowspan="12">订单API</td>
        <td>/open/webapi/orderapi/modifyorder/saveremark</td>
        <td>修改订单卖家备注（按线上单号）</td>
        <td>JstClient.order().saveOrderRemark()</td>
    </tr>
    <tr>
        <td>/open/orders/modifywms/upload</td>
        <td>订单指定发货仓</td>
        <td>JstClient.order().uploadModifyWmsOrder()</td>
    </tr>
    <tr>
        <td>/open/webapi/orderapi/questionorder/questions</td>
        <td>订单转异常</td>
        <td>JstClient.order().getQuestionOrderQuestions()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/orders/upload</td>
        <td>订单上传(商家自有商城、跨境线下)</td>
        <td>JstClient.order().uploadOrders()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/drporder/split</td>
        <td>订单拆分</td>
        <td>JstClient.order().splitDrpOrder()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/order/remark/upload</td>
        <td>修改订单卖家备注（按内部单号）</td>
        <td>JstClient.order().uploadOrderRemark()</td>
    </tr>
    <tr>
        <td>/open/order/node/soid/set</td>
        <td>通过订单号修改线下备注</td>
        <td>JstClient.order().setOrderNodeBySoid()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/order/label/upload</td>
        <td>订单标签（新增/移除）</td>
        <td>JstClient.order().uploadOrderLabel()</td>
    </tr>
    <tr>
        <td>/open/order/sent/upload</td>
        <td>订单发货-新</td>
        <td>JstClient.order().uploadOrderSent()</td>
    </tr>
    <tr>
        <td>/open/orders/single/query</td>
        <td>订单查询（自有商城、跨境下线）</td>
        <td>JstClient.order().querySingleOrder()</td>
    </tr>
    <tr>
        <td>/open/order/action/query</td>
        <td>订单操作日志查询</td>
        <td>JstClient.order().queryOrderAction()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/orderbyoid/cancel</td>
        <td>订单取消-按内部单号取消</td>
        <td>JstClient.order().cancelOrderByOid()</td>
    </tr>
    <tr>
        <td rowspan="3">物流API</td>
        <td>/open/express/register/upload</td>
        <td>批量快递登记</td>
        <td>JstClient.logistics().uploadExpressRegister()</td>
    </tr>
    <tr>
        <td>/open/orders/weight/send/upload</td>
        <td>称重并发货/快递分拣</td>
        <td>JstClient.logistics().uploadOrderWeightSend()</td>
    </tr>
    <tr>
        <td>/open/logistic/query</td>
        <td>发货信息查询</td>
        <td>JstClient.logistics().queryLogistic()</td>
    </tr>
    <tr>
        <td rowspan="12">采购API</td>
        <td>/open/purchase/query</td>
        <td>采购单查询</td>
        <td>JstClient.purchase().queryPurchase()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/purchase/upload</td>
        <td>采购单上传</td>
        <td>JstClient.purchase().uploadPurchase()</td>
    </tr>
    <tr>
        <td>/open/supplier/upload</td>
        <td>供应商上传</td>
        <td>JstClient.purchase().uploadSupplier()</td>
    </tr>
    <tr>
        <td>/open/supplier/query</td>
        <td>供应商查询</td>
        <td>JstClient.purchase().querySupplier()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/manufacture/query</td>
        <td>加工单查询</td>
        <td>JstClient.purchase().queryManufacture()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/manufacture/upload</td>
        <td>加工单上传</td>
        <td>JstClient.purchase().uploadManufacture()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/purchaselabel/upload</td>
        <td>采购单加工单标签（新增/移除）</td>
        <td>JstClient.purchase().uploadPurchaseLabel()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/appointmentin/upload</td>
        <td>预约入库上传</td>
        <td>JstClient.purchase().uploadAppointmentIn()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/purchasebooking/query</td>
        <td>预约入库查询列表</td>
        <td>JstClient.purchase().queryPurchaseBooking()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/purchase/change/status</td>
        <td>变更采购单状态</td>
        <td>JstClient.purchase().changePurchaseStatus()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/purchase/cancel</td>
        <td>采购单/加工单/预约入库单作废</td>
        <td>JstClient.purchase().cancelPurchase()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/openpurchase/editpurchase</td>
        <td>修改采购单</td>
        <td>JstClient.purchase().editPurchase()</td>
    </tr>
    <tr>
        <td rowspan="6">入库API</td>
        <td>/open/purchasein/query</td>
        <td>采购入库查询</td>
        <td>JstClient.stockIn().queryPurchaseIn()</td>
    </tr>
    <tr>
        <td>/open/purchasein/received/upload</td>
        <td>入库单确认</td>
        <td>JstClient.stockIn().uploadPurchaseInReceived()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/purchasein/createbatch</td>
        <td>生成采购入库单-支持批量</td>
        <td>JstClient.stockIn().createPurchaseInBatch()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/skusn/batchadd/simple</td>
        <td>批量录入唯一码</td>
        <td>JstClient.stockIn().batchAddSkusnSimple()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/packsn/batchadd</td>
        <td>批量录入箱唯一码</td>
        <td>JstClient.stockIn().batchAddPacksn()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/purchasein/purchaseinquery</td>
        <td>采购入库查询</td>
        <td>JstClient.stockIn().queryPurchaseInDetails()</td>
    </tr>
    <tr>
        <td rowspan="5">出库API</td>
        <td>/open/orders/out/simple/query</td>
        <td>销售出库查询</td>
        <td>JstClient.stockOut().queryOrderOutSimple()</td>
    </tr>
    <tr>
        <td>/open/orders/wms/sent/upload</td>
        <td>出库发货</td>
        <td>JstClient.stockOut().uploadWmsSentOrders()</td>
    </tr>
    <tr>
        <td>/open/purchaseout/query</td>
        <td>采购退货查询</td>
        <td>JstClient.stockOut().queryPurchaseOut()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/purchaseout/cancel</td>
        <td>采购退货取消</td>
        <td>JstClient.stockOut().cancelPurchaseOut()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/purchaseout/createbatch</td>
        <td>生成采购退货单-支持批量</td>
        <td>JstClient.stockOut().createPurchaseOutBatch()</td>
    </tr>
    <tr>
        <td rowspan="9">售后API</td>
        <td>/open/refund/single/query</td>
        <td>退货退款查询</td>
        <td>JstClient.afterSale().querySingleRefund()</td>
    </tr>
    <tr>
        <td>/open/aftersale/received/query</td>
        <td>实际收货查询</td>
        <td>JstClient.afterSale().queryAfterSaleReceived()</td>
    </tr>
    <tr>
        <td>/open/aftersale/upload</td>
        <td>售后上传</td>
        <td>JstClient.afterSale().uploadAfterSale()</td>
    </tr>
    <tr>
        <td>/open/aftersale/noinfo/upload</td>
        <td>售后上传（无信息件)</td>
        <td>JstClient.afterSale().uploadNoInfoAfterSale()</td>
    </tr>
    <tr>
        <td>/open/webapi/aftersaleapi/confirmgoods</td>
        <td>售后-确认收到货物（可分批确认）</td>
        <td>JstClient.afterSale().confirmAfterSaleGoods()</td>
    </tr>
    <tr>
        <td>/open/webapi/aftersaleapi/open/unconfirm</td>
        <td>售后单反确认</td>
        <td>JstClient.afterSale().unconfirmAfterSale()</td>
    </tr>
    <tr>
        <td>/open/webapi/aftersaleapi/open/confirm</td>
        <td>售后单确认</td>
        <td>JstClient.afterSale().confirmAfterSale()</td>
    </tr>
    <tr>
        <td>/open/webapi/aftersaleapi/confirmgoodsbyskusns</td>
        <td>唯一码批量确认收货</td>
        <td>JstClient.afterSale().confirmGoodsBySkusns()</td>
    </tr>
    <tr>
        <td>/open/webapi/aftersaleapi/pay/payqueryasmodified</td>
        <td>退款单查询</td>
        <td>JstClient.afterSale().payQueryAsModifiedAfterSale()</td>
    </tr>
    <tr>
        <td rowspan="3">其它出入库API</td>
        <td>/open/other/inout/query</td>
        <td>其它出入库查询</td>
        <td>JstClient.otherStocking().queryOtherInOut()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/otherinout/upload</td>
        <td>新建其它出入库</td>
        <td>JstClient.otherStocking().uploadOtherInOut()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/otherinout/cancel</td>
        <td>其它出入库状态变更</td>
        <td>JstClient.otherStocking().cancelOtherInOut()</td>
    </tr>
    <tr>
        <td rowspan="6">调拨API</td>
        <td>/open/allocate/query</td>
        <td>调拨单查询</td>
        <td>JstClient.allocate().queryAllocate()</td>
    </tr>
    <tr>
        <td>/open/allocate/kc/upload</td>
        <td>库存调拨上传（跨仓调拨）</td>
        <td>JstClient.allocate().uploadKcAllocate()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/allocate/in/upload</td>
        <td>库存调拨上传（仓内调拨）</td>
        <td>JstClient.allocate().uploadInAllocate()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/allocate/confirm</td>
        <td>调拨单确认</td>
        <td>JstClient.allocate().confirmAllocate()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/allocate/cancel/v2</td>
        <td>调拨单取消</td>
        <td>JstClient.allocate().cancelAllocateV2()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/diffallocate/create</td>
        <td>创建调拨差异单</td>
        <td>JstClient.allocate().createDiffAllocate()</td>
    </tr>
    <tr>
        <td rowspan="8">虚拟仓API</td>
        <td>/open/webapi/itemapi/lockwarehouse/getlwhallocationlist</td>
        <td>虚拟仓调拨单据分页接口</td>
        <td>JstClient.warehouse().getLwhAllocationList()</td>
    </tr>
    <tr>
        <td>/open/webapi/itemapi/lockwarehouse/getlwhoperationlist</td>
        <td>虚拟仓分配归还单据分页接口</td>
        <td>JstClient.warehouse().getLwhOperationList()</td>
    </tr>
    <tr>
        <td>/open/webapi/itemapi/lockwarehouse/lwhallocationcreate</td>
        <td>虚拟仓调拨单创建接口</td>
        <td>JstClient.warehouse().createLwhAllocation()</td>
    </tr>
    <tr>
        <td>/open/webapi/itemapi/lockwarehouse/lwhoperationcreate</td>
        <td>虚拟仓分配/归还单据创建接口</td>
        <td>JstClient.warehouse().createLwhOperation()</td>
    </tr>
    <tr>
        <td>/open/webapi/itemapi/lockwarehouse/getwarehouselist</td>
        <td>获取虚拟仓列表</td>
        <td>JstClient.warehouse().getWarehouseList()</td>
    </tr>
    <tr>
        <td>/open/webapi/itemapi/iteminventory/getvirtualstock</td>
        <td>虚拟仓商品库存查询</td>
        <td>JstClient.warehouse().getVirtualStock()</td>
    </tr>
    <tr>
        <td>/open/webapi/itemapi/lockwarehouse/lockpurchase/createorupdatepurchase</td>
        <td>创建/更新虚拟仓采购申请</td>
        <td>JstClient.warehouse().createOrUpdateLockPurchase()</td>
    </tr>
    <tr>
        <td>/open/webapi/itemapi/lockwarehouse/lockpurchase/getpagelockpurchases</td>
        <td>查询虚拟仓采购单</td>
        <td>JstClient.warehouse().getPageLockPurchases()</td>
    </tr>
    <tr>
        <td rowspan="7">跨境API</td>
        <td>/open/webapi/cb/cborder/getrefunds</td>
        <td>跨境售后单查询</td>
        <td>JstClient.crossBorder().getCbRefunds()</td>
    </tr>
    <tr>
        <td>/open/webapi/cb/cborder/getorders</td>
        <td>跨境订单查询</td>
        <td>JstClient.crossBorder().getCbOrders()</td>
    </tr>
    <tr>
        <td>/open/webapi/cb/cbfirsttrip/createfirsttrip</td>
        <td>创建头程单</td>
        <td>JstClient.crossBorder().createFirstCbTrip()</td>
    </tr>
    <tr>
        <td>/open/webapi/cblogisticsapi/cblogistics/gettrackdetail</td>
        <td>【收费】获取跨境轨迹详情</td>
        <td>JstClient.crossBorder().getCbLogisticsTrackDetail()</td>
    </tr>
    <tr>
        <td>/open/webapi/globalapi/skumap/mapping</td>
        <td>1688商品映射推送</td>
        <td>JstClient.crossBorder().mapSkuMap()</td>
    </tr>
    <tr>
        <td>/open/webapi/cblogisticsapi/cbexpressstatement/savefee</td>
        <td>尾程运费回写接口</td>
        <td>JstClient.crossBorder().saveCbExpressStatementFee()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/allocate/loadallocatefee</td>
        <td>查询调拨单头程费用</td>
        <td>JstClient.crossBorder().loadAllocateFee()</td>
    </tr>
    <tr>
        <td>聚工单开放API</td>
        <td>/open/api/gd/open/workorder/updateworkorder</td>
        <td>商家更新工单数据</td>
        <td>JstClient.workOrder().updateWorkOrder()</td>
    </tr>
    <tr>
        <td rowspan="2">财务API</td>
        <td>/open/jushuitan/shengsuan/payment/query</td>
        <td>付款单查询</td>
        <td>JstClient.finance().queryShengsuanPayment()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/shengsuan/payable/query</td>
        <td>应付单查询</td>
        <td>JstClient.finance().queryShengsuanPayable()</td>
    </tr>
    <tr>
        <td rowspan="8">播种API</td>
        <td>/open/webapi/wmsapi/wave/bindbinidcarryid</td>
        <td>绑定播种车</td>
        <td>JstClient.seed().bindBinIdCarryIdToWave()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/wave/get</td>
        <td>获取播种批次信息（支持新版三方仓查询）</td>
        <td>JstClient.seed().getJushuitanWave()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/seed/callback</td>
        <td>播种回传（出库）</td>
        <td>JstClient.seed().callbackSeed()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/wave/unbindinoutbycarryid</td>
        <td>根据播种车号解绑出库单</td>
        <td>JstClient.seed().unbindInOutByCarryId()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/seed/return</td>
        <td>播种回传（不出库）</td>
        <td>JstClient.seed().returnSeed()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/wave/unbindwavecarryid</td>
        <td>解绑批次拣货车/播种车</td>
        <td>JstClient.seed().unbindWaveCarryId()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/binid/carryid/bind</td>
        <td>绑定播种柜号和播种车</td>
        <td>JstClient.seed().bindBinIdCarryId()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/carryid/check</td>
        <td>校验播种车的状态是否可用</td>
        <td>JstClient.seed().checkCarryId()</td>
    </tr>
    <tr>
        <td rowspan="4">胜算API</td>
        <td>/open/webapi/pfopen/pfopenalifee/getopenalipaybillrecords</td>
        <td>获取胜算平台原始账单</td>
        <td>JstClient.shengsuan().getOpenAlipayBillRecords()</td>
    </tr>
    <tr>
        <td>/open/webapi/pfopen/pfopenalifee/getopenalipaypromotionfee</td>
        <td>获取胜算店铺级推广费</td>
        <td>JstClient.shengsuan().getOpenAlipayPromotionFee()</td>
    </tr>
    <tr>
        <td>/open/webapi/pfopen/pfopenalifee/getopenpfpromotionshopitem</td>
        <td>获取胜算链接级推广费数据</td>
        <td>JstClient.shengsuan().getOpenPfPromotionShopItem()</td>
    </tr>
    <tr>
        <td>/open/webapi/pfopen/pfopenorderfee/getopenfeeflowing</td>
        <td>获取胜算日常记账数据</td>
        <td>JstClient.shengsuan().getOpenFeeFlowing()</td>
    </tr>
    <tr>
        <td rowspan="9">供应链对外开放API</td>
        <td>/open/api/goods/inneropen/category/querycategorybypid</td>
        <td>通用资料根据父类目ID查询子类目</td>
        <td>JstClient.supplyChainOpen().queryCategoryByPid()</td>
    </tr>
    <tr>
        <td>/open/api/goods/inneropen/supplier/goods/querydiserpgoodsdata</td>
        <td>供应商价格及库存商品列表</td>
        <td>JstClient.supplyChainOpen().queryDiserpGoodsData()</td>
    </tr>
    <tr>
        <td>/open/api/goods/inneropen/oss/uploadimage</td>
        <td>生成商品图片链接</td>
        <td>JstClient.supplyChainOpen().uploadImageToOss()</td>
    </tr>
    <tr>
        <td>/open/api/goods/inneropen/goods/batchupdatedistributionstatus</td>
        <td>批量更新商品分销状态</td>
        <td>JstClient.supplyChainOpen().batchUpdateDistributionStatus()</td>
    </tr>
    <tr>
        <td>/open/api/goods/inneropen/goods/updategoods</td>
        <td>更新通用商品资料</td>
        <td>JstClient.supplyChainOpen().updateGoods()</td>
    </tr>
    <tr>
        <td>/open/api/goods/inneropen/goods/querygoodslist</td>
        <td>查询通用商品资料列表</td>
        <td>JstClient.supplyChainOpen().queryGoodsList()</td>
    </tr>
    <tr>
        <td>/open/api/goods/inneropen/goods/querygoodsdetail</td>
        <td>查询通用商品资料详情</td>
        <td>JstClient.supplyChainOpen().queryGoodsDetail()</td>
    </tr>
    <tr>
        <td>/open/api/goods/inneropen/goods/addgoods</td>
        <td>添加通用商品资料</td>
        <td>JstClient.supplyChainOpen().addGoods()</td>
    </tr>
    <tr>
        <td>/open/api/goods/inneropen/oss/queryosssignature</td>
        <td>查询OSS授权信息</td>
        <td>JstClient.supplyChainOpen().queryOssSignature()</td>
    </tr>
    <tr>
        <td rowspan="22">WMSAPI</td>
        <td>/open/jushuitan/quicksale/arrival</td>
        <td>快销到货</td>
        <td>JstClient.wms().quickSaleArrival()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/openskubinquery/findskubin</td>
        <td>根据箱号查询箱内商品推荐仓位</td>
        <td>JstClient.wms().findSkuBin()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/checkoutopen/singleorderconfirms</td>
        <td>发货-强制审核单件商品缺货订单</td>
        <td>JstClient.wms().confirmSingleOrderCheckout()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/recommend/bin/get</td>
        <td>获取推荐仓位</td>
        <td>JstClient.wms().getRecommendBin()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/checkout/getfastdeliveryordercount</td>
        <td>查询极速发货订单数</td>
        <td>JstClient.wms().getFastDeliveryOrderCount()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/shippingpack/addshippingpack</td>
        <td>发货装箱</td>
        <td>JstClient.wms().addShippingPack()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/skusn/queryinoutitemskusns</td>
        <td>唯一码进出流水查询</td>
        <td>JstClient.wms().queryInOutItemSkusns()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/packageentries/saveipcvediorecord</td>
        <td>打包机保存视频记录</td>
        <td>JstClient.wms().saveIpcVedioRecord()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/wavestatus/upload</td>
        <td>更新批次拣货状态</td>
        <td>JstClient.wms().uploadWaveStatus()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/order/single/confirm</td>
        <td>强制审核单件商品缺货订单并入库</td>
        <td>JstClient.wms().confirmSingleOrder()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/worklog/getworklog</td>
        <td>查询WMS工作日志</td>
        <td>JstClient.wms().getWorkLog()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/wavequery/loadwavesbyfilter</td>
        <td>拣货批次管理查询</td>
        <td>JstClient.wms().loadWavesByFilter()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/worklog/workloadappend</td>
        <td>工作量补入</td>
        <td>JstClient.wms().appendWorkload()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/pickwave/query</td>
        <td>机器人获取批次</td>
        <td>JstClient.wms().queryPickWave()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/prereducewave/query</td>
        <td>批次预占重算</td>
        <td>JstClient.wms().queryPreReduceWave()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/reducestock/waitpick/get</td>
        <td>获取正在等待拣货的预占信息</td>
        <td>JstClient.wms().getWaitPickReduceStock()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/agv/wave/assign</td>
        <td>指定机器人批次</td>
        <td>JstClient.wms().assignAgvWave()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/skusn/load</td>
        <td>查询快销唯一码信息</td>
        <td>JstClient.wms().loadSkusn()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/inout/water/query</td>
        <td>进出仓流水</td>
        <td>JstClient.wms().queryInOutWater()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/openp2dskusn/loadorderchangestatistics</td>
        <td>快销-获取订单替换商品分析</td>
        <td>JstClient.wms().loadOrderChangeStatistics()</td>
    </tr>
    <tr>
        <td>/open/jushuitan/skusn/query</td>
        <td>跟踪信息查询</td>
        <td>JstClient.wms().querySkusn()</td>
    </tr>
    <tr>
        <td>/open/webapi/wmsapi/openp2dskusn/createskusn</td>
        <td>生成快销标签</td>
        <td>JstClient.wms().createSkusn()</td>
    </tr>
</table>
