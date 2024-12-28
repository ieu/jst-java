package io.github.ieu.jst.jackson2.mixin.purchase;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface JstQueryManufactureRequestMixIn {

    @JsonProperty("statusList")
    java.util.List<String> getStatusList();
}
