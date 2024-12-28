package io.github.ieu.jst.jackson2.mixin.stockout;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public interface JstQueryOrderOutSimpleRequestMixIn {

    @JsonProperty("InoutFlds")
    List<String> getInoutFlds();

    @JsonProperty("InoutItemFlds")
    List<String> getInoutItemFlds();
}
