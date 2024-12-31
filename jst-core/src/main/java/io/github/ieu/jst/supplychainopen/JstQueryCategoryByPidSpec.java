package io.github.ieu.jst.supplychainopen;

public class JstQueryCategoryByPidSpec {

    private final JstSupplyChainOpenClient client;

    private final JstQueryCategoryByPidRequest.JstQueryCategoryByPidRequestBuilder requestBuilder = JstQueryCategoryByPidRequest.builder();

    public JstQueryCategoryByPidSpec(JstSupplyChainOpenClient client) {
        this.client = client;
    }

    /**
     * 父类目ID,必填,传0表示查询一级类目
     */
    public JstQueryCategoryByPidSpec pid(String pid) {
        requestBuilder.pid(pid);
        return this;
    }

    public JstQueryCategoryByPidResponse response() {
        return this.client.queryCategoryByPid(requestBuilder.build());
    }
}
