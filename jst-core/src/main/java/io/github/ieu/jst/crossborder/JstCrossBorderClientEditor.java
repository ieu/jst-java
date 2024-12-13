package io.github.ieu.jst.crossborder;

import io.github.ieu.jst.JstClient;

import java.beans.PropertyEditorSupport;

public class JstCrossBorderClientEditor extends PropertyEditorSupport {

    public void setValue(Object value) {
        if (value instanceof JstClient) {
            super.setValue(((JstClient) value).crossBorder());
        } else {
            throw new IllegalArgumentException("Editor supports only conversion of type " + JstClient.class);
        }
    }
}
