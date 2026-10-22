package com.dsa.systemdesign.repository;

import com.dsa.systemdesign.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders,Long> {

}
