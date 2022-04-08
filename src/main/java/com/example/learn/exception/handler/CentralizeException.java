package com.example.learn.exception.handler;

import com.example.learn.exception.StudentExist;
import com.example.learn.exception.StudentNotFoundException;
import com.example.learn.serverResponse.ApiError;
import com.example.learn.serverResponse.ServerResponse;
import com.example.learn.serverResponse.ServerUtility;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
@Slf4j
public class CentralizeException extends ResponseEntityExceptionHandler {


    @ExceptionHandler(StudentExist.class)
    protected ResponseEntity<ServerResponse> handleStudentExist(StudentExist ex){
        getPrintStack(ex);
        return new ResponseEntity<>(ServerUtility.getFailedResponse(ex.getMessage()),HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(StudentNotFoundException.class)
    protected ResponseEntity<ServerResponse> handleStudentNotFound(StudentNotFoundException ex){
        getPrintStack(ex);
        return new ResponseEntity<>(ServerUtility.getNotfoundResponse(ex.getMessage()),HttpStatus.NOT_FOUND);
    }

    private void getPrintStack(Exception ex){
        log.info(":: error {} ",ex.getMessage());
        ex.printStackTrace();
    }
}
