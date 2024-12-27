package io.github.ieu.jst.jackson2.mixin.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.github.ieu.jst.finance.JstQueryShengsuanPayableResponse;

import java.util.List;

public interface JstQueryShengsuanPayableResponseMixIn {

    interface Pagination {

        @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
        interface Data {

            @JsonProperty("TS")
            Number getTs();

            @JsonProperty("items")
            List<JstQueryShengsuanPayableResponse.Pagination.Data.Item> getItems();

            @JsonProperty("free_items")
            List<JstQueryShengsuanPayableResponse.Pagination.Data.FreeItem> getFreeItems();

            @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
            interface FreeItem {

            }

            @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
            interface Item {

            }
        }
    }
}
