package com.crud.crud.Service;

import com.crud.crud.Entity.Employee;
import com.crud.crud.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAll(){
        return employeeRepository.getAll();
    }

    public String add(Employee emp){
        return employeeRepository.add(emp);
    }

    public String edit(Employee emp){
        return employeeRepository.edit(emp);
    }

    public String delete(int empNo){
        return employeeRepository.delete(empNo);
    }

}
