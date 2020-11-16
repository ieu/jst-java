package io.github.ieu.jst.example.web.rest;

import io.github.ieu.jst.JstClient;
import io.github.ieu.jst.order.model.Order;
import io.github.ieu.jst.order.model.OrdersSingleQueryParam;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final JstClient jstClient;

    public OrderController(JstClient jstClient) {
        this.jstClient = jstClient;
    }

    @GetMapping
    public List<Order> get(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime modifiedBegin,
                           @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime modifiedEnd,
                           @RequestParam(defaultValue = "1") int pageIndex,
                           @RequestParam(defaultValue = "50") int pageSize) {
        return jstClient.order().querySingleOrder(
                OrdersSingleQueryParam.builder()
                        .modifiedBegin(modifiedBegin.atZone(ZoneId.systemDefault()))
                        .modifiedEnd(modifiedEnd.atZone(ZoneId.systemDefault()))
                        .pageIndex(pageIndex)
                        .pageSize(pageSize)
                        .build()
        );
    }
}
