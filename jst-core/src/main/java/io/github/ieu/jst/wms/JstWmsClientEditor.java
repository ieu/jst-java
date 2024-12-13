package io.github.ieu.jst.wms;

import io.github.ieu.jst.JstClient;

import java.beans.PropertyEditorSupport;

public class JstWmsClientEditor extends PropertyEditorSupport {

    public void setValue(Object value) {
        if (value instanceof JstClient) {
            super.setValue(((JstClient) value).wms());
        } else {
            throw new IllegalArgumentException("Editor supports only conversion of type " + JstClient.class);
        }
    }
}
