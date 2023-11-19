package com.project.web_servicespring_boot.service;

import com.project.web_servicespring_boot.entides.User;
import com.project.web_servicespring_boot.repositories.UseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UseRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(long id){
        Optional<User>obj=repository.findById(id);
        return obj.get();
    }

}
