package io.github.ieu.jst.jackson2.mixin.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface JstUploadOrdersRequestMixIn {

    interface OrderExt {

        interface ExtData {

        }
    }

    interface FinanceData {

    }

    interface Invoice {

        @JsonProperty("userName")
        String getUserName();

        @JsonProperty("userPhone")
        String getUserPhone();

        @JsonProperty("userAddress")
        String getUserAddress();
    }

    interface Card {

    }

    interface Item {

    }
}
