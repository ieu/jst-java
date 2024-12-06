package io.github.ieu.jst.wms;

@lombok.Data
@lombok.Builder
public class JstCreateSkusnRequest {

    /**
     * 订单号
     */
    private java.util.List<Integer> orderIds;
}
