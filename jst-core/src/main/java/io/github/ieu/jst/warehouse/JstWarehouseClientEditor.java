package io.github.ieu.jst.warehouse;

import io.github.ieu.jst.JstClient;

import java.beans.PropertyEditorSupport;

public class JstWarehouseClientEditor extends PropertyEditorSupport {

    public void setValue(Object value) {
        if (value instanceof JstClient) {
            super.setValue(((JstClient) value).warehouse());
        } else {
            throw new IllegalArgumentException("Editor supports only conversion of type " + JstClient.class);
        }
    }
}
