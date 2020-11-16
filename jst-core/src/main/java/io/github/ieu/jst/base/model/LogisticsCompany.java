package io.github.ieu.jst.base.model;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class LogisticsCompany {
    /**
     * 快递公司编码，ERP唯一
     */
    private String lcId;
    /**
     * 快递公司
     */
    private String lcName;
    /**
     * 修改时间
     */
    private ZonedDateTime modified;
}
