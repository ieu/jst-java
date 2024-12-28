package io.github.ieu.jst.jackson2.mixin.seed;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ieu.jst.seed.JstGetJushuitanWaveResponse;

import java.util.List;

public interface JstGetJushuitanWaveResponseMixIn {

    interface Data {

        @JsonProperty("Inouts")
        List<JstGetJushuitanWaveResponse.Data.Inout> getInouts();

        interface Inout {

            interface Item {

            }
        }
    }
}
