package io.github.ieu.jst.jackson2.mixin.logistics;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface JstUploadExpressRegisterRequestMixIn {

    @JsonProperty("warehouseRemark")
    String getWarehouseRemark();
}
