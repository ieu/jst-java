package io.github.ieu.jst.item;

public class JstAddOrUpdateCategorySpec {

    private final JstItemClient client;

    private final JstAddOrUpdateCategoryRequest.JstAddOrUpdateCategoryRequestBuilder requestBuilder = JstAddOrUpdateCategoryRequest.builder();

    public JstAddOrUpdateCategorySpec(JstItemClient client) {
        this.client = client;
    }

    /**
     * 分类名
     */
    public JstAddOrUpdateCategorySpec cName(String cName) {
        requestBuilder.cName(cName);
        return this;
    }

    /**
     * 父级分类id
     */
    public JstAddOrUpdateCategorySpec parentCId(Number parentCId) {
        requestBuilder.parentCId(parentCId);
        return this;
    }

    /**
     * 分类Id(创建时系统自动生成的值，修改时需要传)
     */
    public JstAddOrUpdateCategorySpec cId(Number cId) {
        requestBuilder.cId(cId);
        return this;
    }

    /**
     * 排序
     */
    public JstAddOrUpdateCategorySpec sort(Number sort) {
        requestBuilder.sort(sort);
        return this;
    }

    /**
     * 是否添加PV
     */
    public JstAddOrUpdateCategorySpec isPv(Boolean isPv) {
        requestBuilder.isPv(isPv);
        return this;
    }

    /**
     * 商品类目
     */
    public JstAddOrUpdateCategorySpec pvNames(java.util.List<String> pvNames) {
        requestBuilder.pvNames(pvNames);
        return this;
    }

    /**
     * 是否启用；默认null 不修改
     */
    public JstAddOrUpdateCategorySpec enable(Boolean enable) {
        requestBuilder.enable(enable);
        return this;
    }

    public JstAddOrUpdateCategoryResponse response() {
        return this.client.addOrUpdateCategory(requestBuilder.build());
    }
}
