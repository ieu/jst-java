package io.github.ieu.jst.purchase;

@lombok.Data
@lombok.Builder
public class JstUploadSupplierRequest {

    /**
     * 地址，可更新
     */
    private String address;

    /**
     * 发展日期，可更新
     */
    private String beginDate;

    /**
     * 联系人，可更新
     */
    private String contacts;

    /**
     * 是否生效，可更新
     */
    private Boolean enabled;

    /**
     * 手机，可更新
     */
    private String mobile;

    /**
     * 供应商名称，可更新
     */
    private String name;

    /**
     * 电话，可更新
     */
    private String phone;

    /**
     * 备注1，可更新
     */
    private String remark;

    /**
     * 备注2，可更新
     */
    private String remark2;

    /**
     * 备注3，可更新
     */
    private String remark3;

    /**
     * <div><a href="https://cdn.erp321.cn/jst-fed/799f18a8-d589-416a-a83d-a5072f798cc3_1276_415.png" target="_blank">供应商编码</a></div>可更新
     */
    private String supplierCode;

    /**
     * 开户银行，可更新
     */
    private String depositbank;

    /**
     * 账户名称，可更新
     */
    private String bankacount;

    /**
     * 银行账号，可更新
     */
    private String acountnumber;

    /**
     * 供应商分类，可更新
     */
    private String group;
}
