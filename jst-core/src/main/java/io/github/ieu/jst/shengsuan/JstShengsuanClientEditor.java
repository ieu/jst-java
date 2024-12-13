package io.github.ieu.jst.shengsuan;

import io.github.ieu.jst.JstClient;

import java.beans.PropertyEditorSupport;

public class JstShengsuanClientEditor extends PropertyEditorSupport {

    public void setValue(Object value) {
        if (value instanceof JstClient) {
            super.setValue(((JstClient) value).shengsuan());
        } else {
            throw new IllegalArgumentException("Editor supports only conversion of type " + JstClient.class);
        }
    }
}
