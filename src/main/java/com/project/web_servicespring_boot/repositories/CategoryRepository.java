package com.project.web_servicespring_boot.repositories;

import com.project.web_servicespring_boot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long>{

}
