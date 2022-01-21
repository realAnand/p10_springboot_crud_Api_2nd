package com.crud.Entity;

public class Employee {

    private int employeeId;
    private String employeeName;
    private String address;

    public Employee(){
        super();
    }

    public Employee(int employeeId, String employeeName, String address) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.address = address;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public int setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return employeeName;
    }

    public String getAddress() {
        return address;
    }

    public String setAddress(String address) {
        this.address = address;
        return address;
    }
}
