package io.github.ieu.jst.auth;

import io.github.ieu.jst.JstClient;

import java.beans.PropertyEditorSupport;

public class JstAuthClientEditor extends PropertyEditorSupport {

    public void setValue(Object value) {
        if (value instanceof JstClient) {
            super.setValue(((JstClient) value).auth());
        } else {
            throw new IllegalArgumentException("Editor supports only conversion of type " + JstClient.class);
        }
    }
}
