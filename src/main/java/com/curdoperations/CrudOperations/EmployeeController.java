package com.curdoperations.CrudOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/employee")
    public List <Employee>  getAllEmployee() {
        return employeeService.getAllEmployees();
    }
    @RequestMapping("/employee/{eid}")
    public Employee getEmployee(@PathVariable String eid) {
        return employeeService.getEmployee(eid);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/employee")
    public  List <Employee> addEmployee(@RequestBody Employee employee)
    {
        employeeService.addEmployee(employee);
        return employeeService.getAllEmployees();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employee/{eid}")
    public  String updateEmployee(@RequestBody Employee employee,@PathVariable String eid)
    {
        boolean success = employeeService.updateEmployee(employee,eid);
       if(success){
           return "Successful";
       }else{
           return "Ids did not match  to update";
       }
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/employee/{eid}")
    public  String deleteEmployee(@PathVariable String eid)
    {
        boolean success = employeeService.deleteEmployee(eid);
        if(success){
            return "Successful";
        }else{
            return "Ids did not match  to delete";
        }
    }



}
