package io.github.ieu.jst.auth.caffeine;

import io.github.ieu.jst.auth.JstTokenStore;
import io.github.ieu.jst.auth.JstTokenStoreFactory;

public class CaffeineJstTokenStoreFactory implements JstTokenStoreFactory {

    @Override
    public JstTokenStore create() {
        return new CaffeineJstTokenStore();
    }
}
