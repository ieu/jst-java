package io.github.ieu.jst.item;

@lombok.Data
public class JstQuerySkuResponse {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String msg;

    private Data data;

    @lombok.Data
    public static class Data {

        /**
         * 每页多少条
         */
        private Integer pageSize;

        /**
         * 第几页
         */
        private Integer pageIndex;

        /**
         * 总条数
         */
        private Integer dataCount;

        /**
         * 总页数
         */
        private Integer pageCount;

        /**
         * 是否有下一页
         */
        private Boolean hasNext;

        /**
         * 数据集合
         */
        private java.util.List<Datas> datas;

        @lombok.Data
        public static class Datas {

            /**
             * 商品编码
             */
            private String skuId;

            /**
             * 款式编码
             */
            private String iId;

            /**
             * 商品名称
             */
            private String name;

            /**
             * 商品简称
             */
            private String shortName;

            /**
             * 销售价
             */
            private Number salePrice;

            /**
             * 成本价
             */
            private Number costPrice;

            /**
             * 颜色规格
             */
            private String propertiesValue;

            /**
             * 颜色
             */
            private String color;

            /**
             * 类目id
             */
            private Integer cId;

            /**
             * 分类
             */
            private String category;

            /**
             * 大图地址
             */
            private String picBig;

            /**
             * 图片地址
             */
            private String pic;

            /**
             * 是否启用，0：备用，1：启用，-1：禁用
             */
            private Integer enabled;

            /**
             * 重量
             */
            private Number weight;

            /**
             * 市场价
             */
            private Number marketPrice;

            /**
             * 品牌
             */
            private String brand;

            /**
             * 供应商编号；对应页面：供应商信息-供应商内部编码；接口：供应商查询https://openweb.jushuitan.com/dev-doc?docType=6&docId=29
             */
            private String supplierId;

            /**
             * 供应商名称
             */
            private String supplierName;

            /**
             * 修改时间
             */
            private String modified;

            /**
             * 国标码
             */
            private String skuCode;

            /**
             * 供应商商品编码
             */
            private String supplierSkuId;

            /**
             * 供应商商品款号
             */
            private String supplierIId;

            /**
             * 虚拟分类
             */
            private String vcName;

            /**
             * 商品类型
             */
            private String skuType;

            /**
             * 创建者
             */
            private Integer creator;

            /**
             * 创建时间
             */
            private String created;

            /**
             * 备注
             */
            private String remark;

            /**
             * 商品属性，成品，半成品，原材料，包材
             */
            private String itemType;

            /**
             * 是否禁止同步，0=启用同步，1=禁用同步，2=部分禁用
             */
            private Integer stockDisabled;

            /**
             * 单位
             */
            private String unit;

            /**
             * 保质期
             */
            private Integer shelfLife;

            /**
             * 商品标签，多个标签时以逗号分隔
             */
            private String labels;

            /**
             * 生产许可证
             */
            private String productionLicence;

            /**
             * 长
             */
            private Number l;

            /**
             * 宽
             */
            private Number w;

            /**
             * 高
             */
            private Number h;

            /**
             * 是否开启序列号
             */
            private Boolean isSeriesNumber;

            /**
             * 其他价格1
             */
            private Number otherPrice_1;

            /**
             * 其他价格2
             */
            private Number otherPrice_2;

            /**
             * 其他价格3
             */
            private Number otherPrice_3;

            /**
             * 其他价格4
             */
            private Number otherPrice_4;

            /**
             * 其他价格5
             */
            private Number otherPrice_5;

            /**
             * 其他价格6
             */
            private Number otherPrice_6;

            /**
             * 其他价格7
             */
            private Number otherPrice_7;

            /**
             * 其他价格8
             */
            private Number otherPrice_8;

            /**
             * 其他价格9
             */
            private Number otherPrice_9;

            /**
             * 其他价格10
             */
            private Number otherPrice_10;

            /**
             * 其他属性1
             */
            private String other_1;

            /**
             * 其他属性2
             */
            private String other_2;

            /**
             * 其他属性3
             */
            private String other_3;

            /**
             * 其他属性4
             */
            private String other_4;

            /**
             * 其他属性5
             */
            private String other_5;

            /**
             * 其他属性6
             */
            private String other_6;

            /**
             * 其他属性7
             */
            private String other_7;

            /**
             * 其他属性8
             */
            private String other_8;

            /**
             * 其他属性9
             */
            private String other_9;

            /**
             * 其他属性10
             */
            private String other_10;

            /**
             * 链接同步状态
             */
            private String stockType;

            /**
             * 辅助码
             */
            private String skuCodes;

            /**
             * 唯一id，系统自增id（若商品编码有被修改可以用此字段判断唯一）
             */
            private Integer autoid;

            /**
             * 是否开启生产批次开关
             */
            private String batchEnabled;
        }
    }
}
