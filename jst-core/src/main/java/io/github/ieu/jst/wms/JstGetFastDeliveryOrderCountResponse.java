package io.github.ieu.jst.wms;

@lombok.Data
public class JstGetFastDeliveryOrderCountResponse {

    private Number code;

    /**
     * 符合要求订单数
     */
    private String data;

    private String msg;

    private String requestId;
}