package io.github.ieu.jst.order;

import io.github.ieu.jst.*;
import io.github.ieu.jst.order.model.Order;
import io.github.ieu.jst.order.model.OrderStatus;
import io.github.ieu.jst.order.model.OrdersSingleQueryParam;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;

public class DefaultJstOrderClientTest {
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
    private DefaultJstOrderClient orderClient = new DefaultJstOrderClient(requestHelper);

    @Test(expectedExceptions = JstClientException.class)
    public void testQuerySingleOrderRequiredParam() {
        orderClient.querySingleOrder(new OrdersSingleQueryParam());
    }

    @Test
    public void testQuerySingleOrder() {
        ZonedDateTime modifiedBegin = ZonedDateTime.of(
                LocalDateTime.of(
                        LocalDate.of(2020, 1, 1),
                        LocalTime.of(0, 0, 0)
                ),
                DateTimeConversion.TIMEZONE
        );

        ZonedDateTime modifiedEnd = ZonedDateTime.of(
                LocalDateTime.of(
                        LocalDate.of(2020, 1, 8),
                        LocalTime.of(0, 0, 0)
                ),
                DateTimeConversion.TIMEZONE
        );

        List<Order> orders = orderClient.querySingleOrder(
                OrdersSingleQueryParam.builder()
                        .modifiedBegin(modifiedBegin)
                        .modifiedEnd(modifiedEnd)
                        .pageIndex(1)
                        .pageSize(50)
                        .build()
        );
        assertNotNull(orders);
        assertFalse(orders.isEmpty());
    }

    @Test
    public void testQuerySingleOrderRequestOnSoIds() {
        List<Order> orders = orderClient.querySingleOrder(
                OrdersSingleQueryParam.builder()
                        .soIds(Collections.singletonList("201912311828464792857"))
                        .pageIndex(1)
                        .pageSize(50)
                        .build()
        );
        assertNotNull(orders);
        assertFalse(orders.isEmpty());
        for (Order order : orders) {
            assertEquals(order.getSoId(), "201912311828464792857");
        }
    }

    @Test
    public void testQuerySingleOrderRequestOnStatus() {
        ZonedDateTime modifiedBegin = ZonedDateTime.of(
                LocalDateTime.of(
                        LocalDate.of(2020, 1, 1),
                        LocalTime.of(0, 0, 0)
                ),
                DateTimeConversion.TIMEZONE
        );

        ZonedDateTime modifiedEnd = ZonedDateTime.of(
                LocalDateTime.of(
                        LocalDate.of(2020, 1, 8),
                        LocalTime.of(0, 0, 0)
                ),
                DateTimeConversion.TIMEZONE
        );

        List<Order> orders = orderClient.querySingleOrder(
                OrdersSingleQueryParam.builder()
                        .modifiedBegin(modifiedBegin)
                        .modifiedEnd(modifiedEnd)
                        .status(OrderStatus.Sent)
                        .pageIndex(1)
                        .pageSize(50)
                        .build()
        );
        assertNotNull(orders);
        assertFalse(orders.isEmpty());
        for (Order order : orders) {
            assertEquals(order.getStatus(), OrderStatus.Sent);
        }
    }
}