package io.github.ieu.jst.supplychainopen;

/**
 * 业务参数
 */
@lombok.Data
@lombok.Builder
public class JstQueryCategoryByPidRequest {

    /**
     * 父类目ID,必填,传0表示查询一级类目
     */
    private String pid;
}
