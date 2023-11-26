package com.project.web_servicespring_boot.service;

import com.project.web_servicespring_boot.entities.User;
import com.project.web_servicespring_boot.repositories.UseRepository;
import com.project.web_servicespring_boot.service.exception.DatabaseException;
import com.project.web_servicespring_boot.service.exception.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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
        return obj.orElseThrow(()-> new ResourceNotFoundException(id));
    }

    public User insertUser(User user){
        return repository.save(user);
    }

    public void deleteUser(Long id){
        try {
            if (!repository.existsById(id)) throw new ResourceNotFoundException(id);
            repository.deleteById(id);
        }catch(DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public User updateUSer(Long id,User user){
        try{
        User entity=repository.getReferenceById(id);
        updateData(entity,user);
        return repository.save(entity);
        }catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }

    }

    private void updateData(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }
}