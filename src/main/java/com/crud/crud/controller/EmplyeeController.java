package com.crud.crud.controller;

import com.crud.crud.Entity.Employee;
import com.crud.crud.Service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmplyeeController {

    @Autowired
    EmployeService employeService;

    @GetMapping("/get/all")
    public List<Employee> getAll(){
        return employeService.getAll();
    }

    @PostMapping("/add")
    public String add(@RequestBody Employee emp){
        return employeService.add(emp);
    }

    @PutMapping("/edit")
    public String edit(@RequestBody Employee emp){
        return employeService.edit(emp);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam int empNo){
        return employeService.delete(empNo);
    }

}
