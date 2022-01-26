package com.zaurtregulov.spring.rest.exceptionHanding;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeGlobalExceptionHanding {
    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectDate> handlerException(NoSuchEmployeeException exception) {
        EmployeeIncorrectDate date = new EmployeeIncorrectDate();
        date.setInfo(exception.getMessage());
        return new ResponseEntity<>(date, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectDate> handlerException(Exception exception) {
        EmployeeIncorrectDate date = new EmployeeIncorrectDate();
        date.setInfo(exception.getMessage());
        return new ResponseEntity<>(date, HttpStatus.BAD_REQUEST);
    }
}
