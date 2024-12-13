package io.github.ieu.jst.qimen;

import io.github.ieu.jst.JstClient;

import java.beans.PropertyEditorSupport;

public class JstQimenClientEditor extends PropertyEditorSupport {

    public void setValue(Object value) {
        if (value instanceof JstClient) {
            super.setValue(((JstClient) value).qimen());
        } else {
            throw new IllegalArgumentException("Editor supports only conversion of type " + JstClient.class);
        }
    }
}
