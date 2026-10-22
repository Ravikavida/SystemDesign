package com.dsa.systemdesign.service;

import com.dsa.systemdesign.dto.OrderRequest;
import com.dsa.systemdesign.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dsa.systemdesign.entity.Orders;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Orders createOrder(OrderRequest orderRequest) {
        Orders order = new Orders();
        order.setCustomerEmail(orderRequest.getCustomerEmail());
        return orderRepository.save(order);
    }

    public List<Orders> findAllOrders() {

        return orderRepository.findAll();
    }
}
