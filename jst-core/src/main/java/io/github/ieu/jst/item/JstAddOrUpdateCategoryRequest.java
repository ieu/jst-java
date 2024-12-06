package io.github.ieu.jst.item;

@lombok.Data
@lombok.Builder
public class JstAddOrUpdateCategoryRequest {

    /**
     * 分类名
     */
    private String cName;

    /**
     * 父级分类id
     */
    private Number parentCId;

    /**
     * 分类Id(创建时系统自动生成的值，修改时需要传)
     */
    private Number cId;

    /**
     * 排序
     */
    private Number sort;

    /**
     * 是否添加PV
     */
    private Boolean isPv;

    /**
     * 商品类目
     */
    private java.util.List<String> pvNames;

    /**
     * 是否启用；默认null 不修改
     */
    private Boolean enable;
}
