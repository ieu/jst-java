package io.github.ieu.jst.item;

@lombok.Data
@lombok.Builder
public class JstSetSkuBinsRequest {

    /**
     * 商品编码
     */
    private String skuId;

    /**
     * 主仓位
     */
    private String bin;

    /**
     * 补充仓位
     */
    private java.util.List<String> otherBin;

    /**
     * 库容下限
     */
    private Integer minQty;

    /**
     * 库容上限
     */
    private Integer maxQty;

    /**
     * 溢出数量
     */
    private Integer overflowQty;

    /**
     * 标准装箱数
     */
    private Integer packQty;

    /**
     * 装箱体积
     */
    private Number packVolume;
}
