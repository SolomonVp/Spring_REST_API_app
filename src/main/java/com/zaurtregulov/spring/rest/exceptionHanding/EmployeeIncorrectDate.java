package com.zaurtregulov.spring.rest.exceptionHanding;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class EmployeeIncorrectDate {
    private String info;

    public EmployeeIncorrectDate() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
