package io.github.ieu.jst.aftersale;

import io.github.ieu.jst.JstClient;

import java.beans.PropertyEditorSupport;

public class JstAfterSaleClientEditor extends PropertyEditorSupport {

    public void setValue(Object value) {
        if (value instanceof JstClient) {
            super.setValue(((JstClient) value).afterSale());
        } else {
            throw new IllegalArgumentException("Editor supports only conversion of type " + JstClient.class);
        }
    }
}
