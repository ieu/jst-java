package io.github.ieu.jst.jackson2.mixin.stockin;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface JstCreatePurchaseInBatchRequestMixIn {

    interface Item {

        interface SkuSn {

            interface InExtModel {

                @JsonProperty("other_costPrice1")
                Number getOtherCostPrice1();

                @JsonProperty("other_costPrice2")
                Number getOtherCostPrice2();

                @JsonProperty("other_costPrice3")
                Number getOtherCostPrice3();
            }
        }
    }
}
