package io.github.ieu.jst.jackson2.mixin.item;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface JstUploadItemSkuRequestMixin {

    interface Item {

        @JsonProperty("rejectLifecycle")
        Integer getRejectLifecycle();

        @JsonProperty("lockupLifecycle")
        Integer getLockupLifecycle();

        @JsonProperty("adventLifecycle")
        Integer getAdventLifecycle();

        @JsonProperty("CategoryPropertys")
        java.util.Map<String, Object> getCategoryPropertys();
    }
}
