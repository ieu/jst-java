package io.github.ieu.jst.item;

@lombok.Data
@lombok.Builder
public class JstQueryCategoryRequest {

    /**
     * 修改开始时间
     */
    private String modifiedBegin;

    /**
     * 修改结束时间
     */
    private String modifiedEnd;

    /**
     * 第几页
     */
    private Integer pageIndex;

    /**
     * 每页记录数
     */
    private Integer pageSize;

    /**
     * 类目id集合
     */
    private java.util.List<String> cIds;

    /**
     * 父级类目id集合
     */
    private java.util.List<String> parentCIds;
}
