package io.github.ieu.jst.stockout;

import io.github.ieu.jst.JstClient;

import java.beans.PropertyEditorSupport;

public class JstStockOutClientEditor extends PropertyEditorSupport {

    public void setValue(Object value) {
        if (value instanceof JstClient) {
            super.setValue(((JstClient) value).stockOut());
        } else {
            throw new IllegalArgumentException("Editor supports only conversion of type " + JstClient.class);
        }
    }
}