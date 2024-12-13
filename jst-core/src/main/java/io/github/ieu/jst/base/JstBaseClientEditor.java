package io.github.ieu.jst.base;

import io.github.ieu.jst.JstClient;

import java.beans.PropertyEditorSupport;

public class JstBaseClientEditor extends PropertyEditorSupport {

    public void setValue(Object value) {
        if (value instanceof JstClient) {
            super.setValue(((JstClient) value).base());
        } else {
            throw new IllegalArgumentException("Editor supports only conversion of type " + JstClient.class);
        }
    }
}
