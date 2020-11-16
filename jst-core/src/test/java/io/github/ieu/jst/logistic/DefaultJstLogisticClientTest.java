package io.github.ieu.jst.logistic;

import io.github.ieu.jst.JstEndpoint;
import io.github.ieu.jst.JstEnvironment;
import io.github.ieu.jst.RequestHelper;
import io.github.ieu.jst.logistic.model.Logistic;
import io.github.ieu.jst.logistic.model.LogisticQueryParam;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertNotNull;

public class DefaultJstLogisticClientTest {
    private final JstEndpoint jstEndpoint = new JstEndpoint();
    /**
     * @see <a href="https://open.jushuitan.com/document/10.html">https://open.jushuitan.com/document/10.html</a>
     */
    private final RequestHelper requestHelper = new RequestHelper(
            "ywv5jGT8ge6Pvlq3FZSPol345asd",
            "ywv5jGT8ge6Pvlq3FZSPol2323",
            "181ee8952a88f5a57db52587472c3798",
            jstEndpoint.get(JstEnvironment.SANDBOX)
    );
    private DefaultJstLogisticClient logisticClient = new DefaultJstLogisticClient(requestHelper);

    @Test
    public void testQueryLogistic() {
        List<Logistic> logistics = logisticClient.queryLogistic(
                LogisticQueryParam.builder()
                        .soIds(Arrays.asList(
                                "2019165151416570",
                                "201912311828464792857",
                                "2019165dfd570",
                                "1912091604161253S01F01",
                                "202001061740",
                                "201912121441",
                                "201912121441",
                                "202001071046513772116",
                                "111912231000010",
                                "BJ180105104925116686__10"
                        ))
                        .build()
        );
        assertNotNull(logistics);
    }
}