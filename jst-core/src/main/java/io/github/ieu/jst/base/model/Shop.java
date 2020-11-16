package io.github.ieu.jst.base.model;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class Shop {
    /**
     * 店铺编号
     */
    private int shopId;
    /**
     * 淘宝
     */
    private String shopName;
    /**
     * 京东
     */
    private String shopSite;
    /**
     * 昵称
     */
    private String nick;
    /**
     * 授权过期时间
     */
    private ZonedDateTime sessionExpired;
    /**
     * 创建时间
     */
    private ZonedDateTime created;
    /**
     * 组织
     */
    private String organization;
}
