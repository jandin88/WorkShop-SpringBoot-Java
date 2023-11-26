package com.project.web_servicespring_boot.service.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id){
        super("Resource not found. ID"+id);
    }

}
