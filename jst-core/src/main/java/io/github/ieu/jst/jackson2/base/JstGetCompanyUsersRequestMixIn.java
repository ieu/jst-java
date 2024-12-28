package io.github.ieu.jst.jackson2.base;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface JstGetCompanyUsersRequestMixIn {

    @JsonProperty("loginId")
    String getLoginId();
}
