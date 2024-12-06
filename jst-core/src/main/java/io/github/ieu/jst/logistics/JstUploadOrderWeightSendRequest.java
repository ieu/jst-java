package io.github.ieu.jst.logistics;

@lombok.Data
@lombok.Builder
public class JstUploadOrderWeightSendRequest {

    /**
     * 快递单号
     */
    private String lId;

    /**
     * 重量，kg。传0保存0重量，传-1出库单重量为null。需要传空重量的联系我们开开关
     */
    private Number weight;

    /**
     * 默认值为1，0:验货后称重1:验货后称重并发货2:无须验货称重3:无须验货称重并发货4:发货后称重5:自动判断称重并发货
     */
    private Integer type;

    /**
     * 是否是国际运单号：默认为false国内快递
     */
    private Boolean isUnLid;

    /**
     * 体积（单位：立方米）
     */
    private Number fVolume;

    /**
     * 备注称重源，显示在订单操作日志中
     */
    private String channel;
}
