package io.github.ieu.jst.jackson2.mixin.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface JstCreateLwhOperationRequestMixIn {

    @JsonProperty("isIgnore_check_stock")
    Boolean getIsIgnoreCheckStock();

    interface Item {

    }
}
