package com.dsa.systemdesign.controller;


import com.dsa.systemdesign.dto.OrderRequest;
import com.dsa.systemdesign.service.OrderService;
import org.springframework.http.ResponseEntity;
import com.dsa.systemdesign.entity.Orders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createOrder(@RequestBody OrderRequest orderRequest) {
        Orders order = orderService.createOrder(orderRequest);
        return ResponseEntity.ok(order);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Orders>> getAllOrders(){
        List<Orders> allOrders = orderService.findAllOrders();
        return  ResponseEntity.ok(allOrders);
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck(){
        return ResponseEntity.ok("Good Up And Running");
    }
}
