package io.github.ieu.jst.wms;

@lombok.Data
public class JstGetWorkLogResponse {

    private String msg;

    private String code;

    private String requestId;

    private java.util.List<Data> data;

    @lombok.Data
    public static class Data {

        /**
         * 创建人编号
         */
        private String creator;

        /**
         * 箱号
         */
        private String packId;

        /**
         * 创建时间
         */
        private String created;

        /**
         * 仓位
         */
        private String bin;

        /**
         * 序号
         */
        private String autoid;

        /**
         * 公司编码
         */
        private Number coId;

        /**
         * 商品编码
         */
        private String skuId;

        /**
         * 备注
         */
        private String remark;

        /**
         * 类型
         */
        private String type;

        /**
         * 单据编码1
         */
        private String id1;

        /**
         * 单据编码2
         */
        private String id2;

        /**
         * 数量
         */
        private String qty;

        /**
         * 货主编码
         */
        private Number ownerCoId;

        /**
         * 在type为"In"(入库)的情况下,记录的是采购单号；
         */
        private String s2;
    }
}
