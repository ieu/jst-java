package io.github.ieu.jst.item;

public class JstQueryCategorySpec {

    private final JstItemClient client;

    private final JstQueryCategoryRequest.JstQueryCategoryRequestBuilder requestBuilder = JstQueryCategoryRequest.builder();

    public JstQueryCategorySpec(JstItemClient client) {
        this.client = client;
    }

    /**
     * 修改开始时间
     */
    public JstQueryCategorySpec modifiedBegin(String modifiedBegin) {
        requestBuilder.modifiedBegin(modifiedBegin);
        return this;
    }

    /**
     * 修改结束时间
     */
    public JstQueryCategorySpec modifiedEnd(String modifiedEnd) {
        requestBuilder.modifiedEnd(modifiedEnd);
        return this;
    }

    /**
     * 第几页
     */
    public JstQueryCategorySpec pageIndex(Integer pageIndex) {
        requestBuilder.pageIndex(pageIndex);
        return this;
    }

    /**
     * 每页记录数
     */
    public JstQueryCategorySpec pageSize(Integer pageSize) {
        requestBuilder.pageSize(pageSize);
        return this;
    }

    /**
     * 类目id集合
     */
    public JstQueryCategorySpec cIds(java.util.List<String> cIds) {
        requestBuilder.cIds(cIds);
        return this;
    }

    /**
     * 父级类目id集合
     */
    public JstQueryCategorySpec parentCIds(java.util.List<String> parentCIds) {
        requestBuilder.parentCIds(parentCIds);
        return this;
    }

    public JstQueryCategoryResponse response() {
        return this.client.queryCategory(requestBuilder.build());
    }
}
