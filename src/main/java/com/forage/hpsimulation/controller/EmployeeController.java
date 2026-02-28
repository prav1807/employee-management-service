package com.forage.hpsimulation.controller;

import com.forage.hpsimulation.entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {

    // private List<Employee> employees = new ArrayList<>();
    private String employees = "Backend is working fine";

    // Getting full employee list ...
    @GetMapping
    public String getAllEmployees(){
       return employees;
    }
//
//    @PostMapping
//    public Employee addEmployee(@RequestBody Employee employee) {
//        employees.add(employee);
//        return employee;
//    }

}
