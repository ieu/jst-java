package io.github.ieu.jst.logistic.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@Data
public class Logistic {
    /**
     * ERP订单号;唯一
     */
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private int oId;

    /**
     * 店铺编号
     */
    private int shopId;

    /**
     * 订单号，最长不超过 50;唯一
     */
    private String soId;

    /**
     * 发货时间
     */
    private ZonedDateTime sendDate;

    /**
     * 运费
     */
    private BigDecimal freight;

    /**
     * 重量
     */
    private int weight;

    /**
     * 快递公司代码
     */
    private String lcId;

    /**
     * 快递单号
     */
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private String lId;

    /**
     * 快递公司
     */
    private String logisticsCompany;

    /**
     * 订单明细；商品信息
     */
    private List<Item> items;

    /**
     * Workaround to java bean specs.
     */
    public int getoId() {
        return oId;
    }

    /**
     * Workaround to java bean specs.
     */
    public void setoId(int oId) {
        this.oId = oId;
    }

    /**
     * Workaround to java bean specs.
     */
    public String getlId() {
        return lId;
    }

    /**
     * Workaround to java bean specs.
     */
    public void setlId(String lId) {
        this.lId = lId;
    }

    @Data
    public static class Item {
        /**
         * 商家SKU，对应库存管理的 SKU
         */
        private String skuId;

        /**
         * 购买数量
         */
        private int qty;

        /**
         * 子订单号
         */
        private String outerOiId;

        /**
         * 原始平台订单号，可以为空，最长不超过 50
         */
        private String rawSoId;

        /**
         * 内部单号
         */
        @Getter(AccessLevel.NONE)
        @Setter(AccessLevel.NONE)
        private String oId;

        /**
         * Workaround to java bean specs.
         */
        public String getoId() {
            return oId;
        }

        /**
         * Workaround to java bean specs.
         */
        public void setoId(String oId) {
            this.oId = oId;
        }
    }
}
