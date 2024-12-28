package io.github.ieu.jst.jackson2.mixin.supplychainopen;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface JstQueryGoodsDetailResponseMixIn {

    interface Data {

        @JsonProperty("item_spuId")
        String getItemSpuId();

        interface ItemSku {

            @JsonProperty("item_spuId")
            String getItemSpuId();

            @JsonProperty("first_spec_valueN_name")
            String getFirstSpecValueNName();
        }
    }
}
