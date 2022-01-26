package com.zaurtregulov.spring.rest.controller;

import com.zaurtregulov.spring.rest.entity.Employee;
import com.zaurtregulov.spring.rest.exceptionHanding.EmployeeIncorrectDate;
import com.zaurtregulov.spring.rest.exceptionHanding.NoSuchEmployeeException;
import com.zaurtregulov.spring.rest.sevice.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee>allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
        if (employee==null) {
            throw new NoSuchEmployeeException("There is now employee with ID = " + id + " int Database");
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }


}
