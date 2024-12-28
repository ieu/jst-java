package io.github.ieu.jst.jackson2.base;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface JstGetCompanyUsersResponseMixIn {

    interface Pagination {

        interface Data {

            @JsonProperty("roleIds")
            String getRoleIds();

            @JsonProperty("empId")
            String getEmpId();
        }
    }
}
