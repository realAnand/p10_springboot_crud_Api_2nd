package com.crud.controllerTest;

import com.crud.Entity.Employee;
import com.crud.Repository.EmployeeRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmplyeeControllerTest {


    @Test
    void getAll() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Employee> actual = new ArrayList<>();
        Employee e1 = new Employee(1,"Bat-Man","Bat-Cave");
        Employee e2 = new Employee(2,"SuperMan","Krypton");
        employeeRepository.add(e1);
        employeeRepository.add(e2);
        actual.add(e1);
        actual.add(e2);

        List<Employee> expected = employeeRepository.getAll();
        assertIterableEquals(expected,actual);
    }

    @Test
    void add() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Employee> actual = new ArrayList<>();
        Employee e1 = new Employee(1,"Bat-Man","Bat-Cave");
        Employee e2 = new Employee(2,"SuperMan","Krypton");
        employeeRepository.add(e1);
        employeeRepository.add(e2);
        actual.add(e1);
        actual.add(e2);

        List<Employee> expected = employeeRepository.getAll();
        assertIterableEquals(expected,actual);
    }

    @Test
    void edit() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Employee> actual = new ArrayList<>();
        Employee e1 = new Employee(1,"Bat-Man","Bat-Cave");
        Employee e2 = new Employee(2,"SuperMan","Krypton");
        employeeRepository.add(e1);
        employeeRepository.add(e2);

        actual.add(e1);
        actual.add(e2);

        List<Employee> expected = employeeRepository.getAll();
        assertIterableEquals(expected,actual);
    }

    @Test
    void delete() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        List<Employee> actual = new ArrayList<>();
        Employee e1 = new Employee(1,"Bat-Man","Bat-Cave");
        Employee e2 = new Employee(2,"SuperMan","Krypton");
        employeeRepository.add(e1);
        employeeRepository.add(e2);
        employeeRepository.delete(1);

        actual.add(e2);

        List<Employee> expected = employeeRepository.getAll();
        assertIterableEquals(expected,actual);
    }

}