package io.github.ieu.jst.allocate;

import io.github.ieu.jst.JstClient;

import java.beans.PropertyEditorSupport;

public class JstAllocateClientEditor extends PropertyEditorSupport {

    public void setValue(Object value) {
        if (value instanceof JstClient) {
            super.setValue(((JstClient) value).allocate());
        } else {
            throw new IllegalArgumentException("Editor supports only conversion of type " + JstClient.class);
        }
    }
}
