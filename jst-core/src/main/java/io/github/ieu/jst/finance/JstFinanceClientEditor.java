package io.github.ieu.jst.finance;

import io.github.ieu.jst.JstClient;

import java.beans.PropertyEditorSupport;

public class JstFinanceClientEditor extends PropertyEditorSupport {

    public void setValue(Object value) {
        if (value instanceof JstClient) {
            super.setValue(((JstClient) value).finance());
        } else {
            throw new IllegalArgumentException("Editor supports only conversion of type " + JstClient.class);
        }
    }
}
