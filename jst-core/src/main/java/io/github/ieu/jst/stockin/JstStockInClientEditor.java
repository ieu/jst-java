package io.github.ieu.jst.stockin;

import io.github.ieu.jst.JstClient;

import java.beans.PropertyEditorSupport;

public class JstStockInClientEditor extends PropertyEditorSupport {

    public void setValue(Object value) {
        if (value instanceof JstClient) {
            super.setValue(((JstClient) value).stockIn());
        } else {
            throw new IllegalArgumentException("Editor supports only conversion of type " + JstClient.class);
        }
    }
}
