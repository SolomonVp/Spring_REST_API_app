package com.zaurtregulov.spring.rest.exceptionHanding;

public class NoSuchEmployeeException extends RuntimeException{
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
