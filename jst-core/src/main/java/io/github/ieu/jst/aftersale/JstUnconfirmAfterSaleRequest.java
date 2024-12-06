package io.github.ieu.jst.aftersale;

@lombok.Data
@lombok.Builder
public class JstUnconfirmAfterSaleRequest {

    /**
     * 售后单id数组
     */
    private java.util.List<Number> asIds;
}
