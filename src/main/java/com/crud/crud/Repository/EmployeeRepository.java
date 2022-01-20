package com.crud.crud.Repository;

import com.crud.crud.Entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

   public List<Employee> employee = new ArrayList<Employee>();

   public List<Employee> getAll(){
      return employee;
   }

   public String add(Employee emp){
      employee.add(emp);
      return "Sucessfully Added";
   }

   public String edit(Employee emp){
      employee.stream().filter(e -> e.getEmployeeId() == emp.getEmployeeId()).forEach(e -> {
         e.setAddress(emp.getAddress());
         e.setEmployeeName(emp.getEmployeeName());
      });
      return "Successfully Updated";
   }

   public String delete(int empNo){
      employee.remove(empNo-1);
      return "Deleted Sucessfully";
   }

}
