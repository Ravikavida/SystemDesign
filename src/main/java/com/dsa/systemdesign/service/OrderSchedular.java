package com.dsa.systemdesign.service;

import com.dsa.systemdesign.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import com.dsa.systemdesign.entity.Orders;

import java.util.List;

@Service
public class OrderSchedular {

    @Autowired
    private OrderRepository orderRepository;

    //@Scheduled(fixedRate = 5000)
    private void processPendingOrders(){
        System.out.println("schedular started");
        List<Orders> orderList = orderRepository.findAll();
        orderList.forEach(data ->{
            data.setStatus("Completed");
            orderRepository.save(data);
        });

    }
}
