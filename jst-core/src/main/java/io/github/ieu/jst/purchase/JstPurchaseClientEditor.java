package io.github.ieu.jst.purchase;

import io.github.ieu.jst.JstClient;

import java.beans.PropertyEditorSupport;

public class JstPurchaseClientEditor extends PropertyEditorSupport {

    public void setValue(Object value) {
        if (value instanceof JstClient) {
            super.setValue(((JstClient) value).purchase());
        } else {
            throw new IllegalArgumentException("Editor supports only conversion of type " + JstClient.class);
        }
    }
}
