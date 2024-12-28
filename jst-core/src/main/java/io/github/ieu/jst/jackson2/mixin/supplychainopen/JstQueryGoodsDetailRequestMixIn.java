package io.github.ieu.jst.jackson2.mixin.supplychainopen;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface JstQueryGoodsDetailRequestMixIn {

    @JsonProperty("item_spuId")
    String getItemSpuId();
}
