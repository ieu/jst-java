package io.github.ieu.jst.jackson2.mixin.seed;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface JstBindBinIdCarryIdRequestMixIn {

    interface BindBinIdCarryId {

        interface Key {

            interface ExtendFlag {

                @JsonProperty("outer_lock_whId")
                Number getOuterLockWhId();

                interface LockPercentage {

                }
            }
        }
    }
}
