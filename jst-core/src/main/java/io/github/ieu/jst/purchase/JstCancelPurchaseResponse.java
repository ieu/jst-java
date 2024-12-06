package io.github.ieu.jst.purchase;

@lombok.Data
public class JstCancelPurchaseResponse {

    private Number code;

    private String data;

    private String msg;

    private String requestId;
}
