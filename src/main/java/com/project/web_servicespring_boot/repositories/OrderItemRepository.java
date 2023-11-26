package com.project.web_servicespring_boot.repositories;

import com.project.web_servicespring_boot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{

}
