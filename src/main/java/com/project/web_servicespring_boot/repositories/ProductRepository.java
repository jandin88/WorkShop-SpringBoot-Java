package com.project.web_servicespring_boot.repositories;

import com.project.web_servicespring_boot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
