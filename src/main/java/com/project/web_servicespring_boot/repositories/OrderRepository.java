package com.project.web_servicespring_boot.repositories;

import com.project.web_servicespring_boot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
