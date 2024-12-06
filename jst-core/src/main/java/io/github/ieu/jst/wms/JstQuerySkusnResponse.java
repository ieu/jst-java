package io.github.ieu.jst.wms;

@lombok.Data
public class JstQuerySkusnResponse {

    private String code;

    private String issuccess;

    private String msg;

    private java.util.List<Data> data;

    @lombok.Data
    public static class Data {

        /**
         * 唯一码
         */
        private String skuSn;

        /**
         * 公司编号
         */
        private Integer coId;

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * Pack:入库;Out:出库;Pick:拣货;Checkout:验货出库;Seed:播种;PickReturn:拣货归还;Pick1:一单一件拣货;Pick2:一单多件拣货; PaperPick:纸质拣货;WaitConfirm:待出库;WaitPack:待入库;
         */
        private String status;

        /**
         * 批次Id
         */
        private String waveId;

        /**
         * 出库单Id
         */
        private String ioId;

        /**
         * 仓位
         */
        private String bin;

        /**
         * 修改时间
         */
        private String modified;

        /**
         * 箱号
         */
        private String packId;

        /**
         * 款式编码
         */
        private String iId;

        /**
         * 生产批次号
         */
        private String lcId;

        /**
         * 支付时间
         */
        private String payDate;

        /**
         * 商品信息
         */
        private String skuInfo;

        /**
         * 供应商
         */
        private String supplierName;

        /**
         * 打印日期
         */
        private String printDate;

        /**
         * 创建时间
         */
        private String created;

        /**
         * 创建人
         */
        private String creator;

        /**
         * 分仓编号
         */
        private String wmsCoId;

        /**
         * 店铺编号
         */
        private String shopId;

        /**
         * 备注
         */
        private String remark;

        /**
         * 总数量
         */
        private String totalQty;

        /**
         * 批次生产效期
         */
        private String ioDate;

        private String ioitemIndex;

        /**
         * 唯一码类型：单采，单留 ，多拣，多留
         */
        private String pKey;

        /**
         * 采购单号
         */
        private String poId;

        private String prevStatus;

        /**
         * 数量
         */
        private String qty;

        private String fromCoId;

        /**
         * 推送状态
         */
        private String pushStatus;

        private String printTask;

        /**
         * 打印序号
         */
        private String printIndex;

        /**
         * 供应商编号
         */
        private String supplierId;

        /**
         * 供应商款号
         */
        private String supplierIId;

        /**
         * 组合装商品编码
         */
        private String combineSkuId;

        /**
         * 内部单号
         */
        private String oId;

        /**
         * 库存状态
         */
        private String inventoryStatus;

        /**
         * 批次有效期
         */
        private String expirationDate;

        /**
         * 时间戳
         */
        private String ts;

        /**
         * 类型（序列号：SerialNumber 生产批批次：ProducedBatch ，快销采购：p2d）
         */
        private String type;
    }
}
