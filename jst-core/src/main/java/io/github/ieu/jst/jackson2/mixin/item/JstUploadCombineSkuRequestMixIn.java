package io.github.ieu.jst.jackson2.mixin.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ieu.jst.item.JstUploadCombineSkuRequest;

import java.util.List;

public interface JstUploadCombineSkuRequestMixIn {

    interface Item {

        @JsonProperty("childList")
        List<JstUploadCombineSkuRequest.Item.Child> getChildList();

        interface Child {

        }
    }
}
