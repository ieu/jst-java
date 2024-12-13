package io.github.ieu.jst.item;

import io.github.ieu.jst.JstClient;

import java.beans.PropertyEditorSupport;

public class JstItemClientEditor extends PropertyEditorSupport {

    public void setValue(Object value) {
        if (value instanceof JstClient) {
            super.setValue(((JstClient) value).item());
        } else {
            throw new IllegalArgumentException("Editor supports only conversion of type " + JstClient.class);
        }
    }
}
