package com.crud.entityTest;

import com.crud.Entity.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {


    @Test
    @DisplayName("set employee name test")
    public void setEmployeeNameTest(){
        Employee employee = new Employee();
        String actualName = employee.setEmployeeName("Anand");
        String expectedName = "Anand";
        assertEquals(expectedName,actualName, () -> "actual and expected does not matches");
    }

    @Test
    @DisplayName("set employee id test")
    public void setEmployeeIdTest(){
        Employee employee = new Employee();
        int actualId = employee.setEmployeeId(1);
        int expectedId = 1;
        assertEquals(expectedId,actualId,() -> "Id does not matches");
    }

    @Test
    @DisplayName("set address test")
    public void setAddressTest(){
        Employee employee = new Employee();
        String actualAddress = employee.setAddress("59 ,Sona Palace,Judge Colony,Patna");
        String expectedAddress = "59 ,Sona Palace,Judge Colony,Patna";
        assertEquals(expectedAddress,actualAddress,() -> "Address does not matches with expectdAddress");
    }

    @Test
    public void getEmployeeName(){
        Employee employee = new Employee();
        String employeeName = employee.getEmployeeName();
        assertNull(employeeName,"Employee name is not null");
    }

    @Test
    public void getEmployeeId(){
        Employee employee = new Employee();
        int employeeName = employee.getEmployeeId();
        assertEquals(0,employeeName,()->"Employee id is not null");
    }

    @Test
    public void getEmployeeAddress(){
        Employee employee = new Employee();
        String employeeName = employee.getAddress();
        assertNull(employeeName,()->"Employee address is not null");

    }

}