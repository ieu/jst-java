package io.github.ieu.jst.jackson2.mixin;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.github.ieu.jst.finance.JstQueryShengsuanPaymentResponse;

import java.util.List;

public interface JstQueryShengsuanPaymentResponseMixIn {

    interface Pagination {

        @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
        interface Data {

            @JsonProperty("TS")
            Number getTs();

            @JsonProperty("items")
            List<JstQueryShengsuanPaymentResponse.Pagination.Data.Item> getItems();

            @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
            interface Item {

            }
        }
    }
}
