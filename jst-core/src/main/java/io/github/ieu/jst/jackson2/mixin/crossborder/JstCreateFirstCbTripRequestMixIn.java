package io.github.ieu.jst.jackson2.mixin.crossborder;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface JstCreateFirstCbTripRequestMixIn {

    interface Item {

        @JsonProperty("estimateInstock_date")
        String getEstimateInstockDate();
    }
}
