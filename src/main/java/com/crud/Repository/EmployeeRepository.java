package com.crud.Repository;

import com.crud.Entity.Employee;
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
//   TODO: 1.create method name getById
//           2.passed id as int
//           3.iterate over list employee
//           4.search for id
//           5.return employee



   public void setId(passed id) {
      this.id = id;
   }

   public passed getId() {
      return id;
   }

   public String delete(int empNo){
      employee.remove(empNo-1);
      return "Deleted Sucessfully";
   }

}
