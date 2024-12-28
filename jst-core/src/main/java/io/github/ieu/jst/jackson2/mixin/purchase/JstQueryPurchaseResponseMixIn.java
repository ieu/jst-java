package io.github.ieu.jst.jackson2.mixin.purchase;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface JstQueryPurchaseResponseMixIn {

    interface Pagination {

        interface Data {

            interface Item {

                @JsonProperty("inQty")
                Number getInQty();
            }
        }
    }
}
