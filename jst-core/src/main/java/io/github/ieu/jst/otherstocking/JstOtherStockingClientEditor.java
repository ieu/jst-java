package io.github.ieu.jst.otherstocking;

import io.github.ieu.jst.JstClient;

import java.beans.PropertyEditorSupport;

public class JstOtherStockingClientEditor extends PropertyEditorSupport {

    public void setValue(Object value) {
        if (value instanceof JstClient) {
            super.setValue(((JstClient) value).otherStocking());
        } else {
            throw new IllegalArgumentException("Editor supports only conversion of type " + JstClient.class);
        }
    }
}
