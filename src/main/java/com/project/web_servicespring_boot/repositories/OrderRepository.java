package com.project.web_servicespring_boot.repositories;

import com.project.web_servicespring_boot.entides.Order;
import com.project.web_servicespring_boot.entides.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
