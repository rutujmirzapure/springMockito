package com.example.spring_mockito.controller;

import com.example.spring_mockito.dao.EmployeeRepository;
import com.example.spring_mockito.model.Employee;
import com.example.spring_mockito.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/EmployeeService")
public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/addEmployee")
    public Response addEmployee(@RequestBody Employee employee){
        repository.save(employee);
        return new Response(employee.getId() + " inserted", Boolean.TRUE);
    }
    @GetMapping("/getEmployee")
    public Response getAllEmployee(){
        List<Employee> employees = repository.findAll();
        return new Response("record counts :" + employees.size(),Boolean.TRUE);
    }
}
