package io.github.ieu.jst.otherstocking;

/**
 * 其它出入库API
 */
public interface JstOtherStockingClient {

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=10&docId=42">其它出入库查询</a>
     */
    JstQueryOtherInOutResponse queryOtherInOut(JstQueryOtherInOutRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=10&docId=43">新建其它出入库</a>
     */
    JstUploadOtherInOutResponse uploadOtherInOut(JstUploadOtherInOutRequest request);

    /**
     * <a href="https://openweb.jushuitan.com/dev-doc?docType=10&docId=223">其它出入库状态变更</a>
     */
    JstCancelOtherInOutResponse cancelOtherInOut(JstCancelOtherInOutRequest request);
}
