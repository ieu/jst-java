非官方聚水潭[开放平台](https://open.jushuitan.com/) SDK

## 使用方式

### 示例

```java
JstClient jstClient = new DefaultJstClient(
        "Your Partner Id",
        "Your Partner Key",
        "Your Token",
        JstEnvironment.PRODUCTION
);

// 查询店铺
List<Shop> shops = jstClient.base().queryShops();

// 查询订单
List<Order> orders = jstClient.order().querySingleOrder();

// 查询发货信息
List<Logistic> logistics = jstClient.logistic().queryLogistic();
```

### Spring Boot 集成

1. 配置 `application.yml`：

```yaml
jst:
  partner-id: Your Partner Id
  partner-key: Your Partner Key
  token: Your Token
```

2. 注入 `JstClient`：

```java
@Inject JstClient jstClient;
```

## 开发计划

### 消息推送

模块 | 接口 | 状态
--- | --- | ---
消息推送 | 库存同步 | ☐
消息推送 | 取消订单 | ☐
消息推送 | 物流同步 | ☐
消息推送 | 售后收货 | ☐

### 基础API

模块 | 接口 | 状态
--- | --- | ---
基础API | 店铺查询 | 🗹
基础API | 物流公司查询 | 🗹
基础API | 分仓查询 | 🗹
基础API | 刷新token(必接) | 🗹
基础API | 分销商查询列表 | 🗹

### 商品API

模块 | 接口 | 状态
--- | --- | ---
商品API | 普通商品上传(异步) | ☐
商品API | 商品维护上传 | ☐
商品API | 商品映射查询 | ☐
商品API | 组合商品查询 | ☐
商品API | 商品类目查询 | ☐
商品API | 商品维护查询 | ☐
商品API | 普通商品查询 | ☐

### 库存API

模块 | 接口 | 状态
--- | --- | ---
库存API | 库存查询 | ☐
库存API | 库存盘点查询 | ☐
库存API | 实际库存同步 | ☐
库存API | 盘点单上传(生效) | ☐

### 订单API

模块 | 接口 | 状态
--- | --- | ---
订单API | 订单上传(推荐) | ☐
订单API | 订单取消(推荐) | ☐
订单API | 订单发货 | ☐
订单API | 订单操作日志查询 | ☐
订单API | 订单指定分仓 | ☐
订单API | 订单查询 | 🗹

### 物流API

模块 | 接口 | 状态
--- | --- | ---
物流API | 平台订单发货 | ☐
物流API | 批量快递登记 | ☐
物流API | 称重并发货 | ☐
物流API | 发货信息查询 | 🗹

### 采购API

模块 | 接口 | 状态
--- | --- | ---
采购API | 采购单上传 | ☐
采购API | 采购单查询 | ☐
采购API | 供应商上传 | ☐
采购API | 供应商查询 | ☐

### 入库API

模块 | 接口 | 状态
--- | --- | ---
入库API | 采购入库上传 | ☐
入库API | 采购入库查询 | ☐
入库API | 采购按箱入库 | ☐
入库API | 入库单确认 | ☐
入库API | 采购按箱入库(预进仓) | ☐

### 出库API

模块 | 接口 | 状态
--- | --- | ---
出库API | 销售出库查询 | ☐
出库API | 出库唯一码查询 | ☐
出库API | 出库发货 | ☐
出库API | 采购退货上传 | ☐
出库API | 采购退货查询 | ☐

### 售后API

模块 | 接口 | 状态
--- | --- | ---
售后API | 退货退款查询 | ☐
售后API | 实际收货上传 | ☐
售后API | 实际收货查询 | ☐
售后API | 送仓售后查询 | ☐
售后API | 售后上传 | ☐

### 操作日志

模块 | 接口 | 状态
--- | --- | ---
操作日志 | 操作查询 | ☐

### 其它出入库API

模块 | 接口 | 状态
--- | --- | ---
其它出入库API | 其它出库上传 | ☐
其它出入库API | 其它退货上传 | ☐
其它出入库API | 其它出库上传(确认) | ☐
其它出入库API | 其它退货上传(确认) | ☐
其它出入库API | 其它出入库查询 | ☐

### 电子面单

模块 | 接口 | 状态
--- | --- | ---
电子面单 | 获取顺丰电子面单 | ☐
电子面单 | 获取青龙电子面单 | ☐
电子面单 | 获取无界电子面单 | ☐
电子面单 | 获取顺丰子母单信息 | ☐

### 调拨API

模块 | 接口 | 状态
--- | --- | ---
调拨API |调拨单查询 | ☐
调拨API |库存调拨上传 | ☐
调拨API |库存调拨上传(生效) | ☐
