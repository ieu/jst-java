package io.github.ieu.jst.base;

@lombok.Data
@lombok.Builder
public class JstQueryShopsRequest {

    /**
     * 第几页，默认第一页
     */
    private Integer pageIndex;

    /**
     * 每页多少条；默认100条，最大100条
     */
    private Integer pageSize;

    /**
     * 店铺编码
     */
    private java.util.List<Integer> shopIds;
}
