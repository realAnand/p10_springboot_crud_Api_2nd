package com.crud.crud;

import com.crud.crud.Entity.Employee;
import com.crud.crud.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Employee e1 = new Employee(1,"Bat-Man","Bat-Cave");
        Employee e2 = new Employee(2,"SuperMan","Kripton");

        employeeRepository.employee.addAll(Arrays.asList(e1,e2));

    }
}
