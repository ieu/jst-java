package io.github.ieu.jst.workorder;

import io.github.ieu.jst.JstClient;

import java.beans.PropertyEditorSupport;

public class JstWorkOrderClientEditor extends PropertyEditorSupport {

    public void setValue(Object value) {
        if (value instanceof JstClient) {
            super.setValue(((JstClient) value).workOrder());
        } else {
            throw new IllegalArgumentException("Editor supports only conversion of type " + JstClient.class);
        }
    }
}
