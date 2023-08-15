package com.project.web_servicespring_boot.repositories;

import com.project.web_servicespring_boot.entides.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UseRepository extends JpaRepository<User,Long>{

}
