package io.github.ieu.jst.base.model;

import lombok.Data;

@Data
public class Warehouse {
    /**
     * 分仓名称
     */
    private String name;
    /**
     * 分仓id
     */
    private String wmsCoId;
    /**
     * 状态
     */
    private String status;
    /**
     * 主仓公司
     */
    private int coId;
}
