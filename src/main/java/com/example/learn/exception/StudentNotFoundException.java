package com.example.learn.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String msg){
        super(msg);
    }
}
