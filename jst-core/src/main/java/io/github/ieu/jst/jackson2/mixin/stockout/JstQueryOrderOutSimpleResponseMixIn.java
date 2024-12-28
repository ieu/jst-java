package io.github.ieu.jst.jackson2.mixin.stockout;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ieu.jst.stockout.JstQueryOrderOutSimpleResponse;

import java.util.List;

public interface JstQueryOrderOutSimpleResponseMixIn {

    interface Pagination {

        interface Data {

            @JsonProperty("ClusterInfos")
            List<JstQueryOrderOutSimpleResponse.Pagination.Data.ClusterInfo> getClusterInfos();

            interface CbFinance {

            }

            interface Sn {

            }

            interface Batch {

            }

            interface ClusterInfo {

            }

            interface Item {

            }
        }
    }
}
