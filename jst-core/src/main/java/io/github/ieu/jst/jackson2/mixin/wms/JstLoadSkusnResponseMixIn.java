package io.github.ieu.jst.jackson2.mixin.wms;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

public interface JstLoadSkusnResponseMixIn {

    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    interface Pagination {

        @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
        interface Item {

        }
    }
}
