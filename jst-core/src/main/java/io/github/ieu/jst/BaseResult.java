package io.github.ieu.jst;

import lombok.Data;

@Data
public class BaseResult {
    /**
     * 0,代表成功，其他代表失败
     */
    private JstResultCode code;

    /**
     * 提示信息
     */
    private String msg;
}
