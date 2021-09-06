package com.curdoperations.CrudOperations;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class EmployeeService {
    private List<Employee> employees;

    {
        employees = new ArrayList<>(Arrays.asList(
                new Employee("A07821", "Vidhya", "vidhya.m@gmail.com", "9234561231"),
                new Employee("A07822", "Navya", "navya.k@gmail.com", "9876543212"),
                new Employee("B07821", "Anil", "anil.k@gmail.com", "8765544332"),
                new Employee("B07822", "swapna", "swapna.km@gmail.com", "9876123455")
        ));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(String eid) {
        if (employees.stream().anyMatch(e -> e.getEid().equals(eid))) {
            return employees.stream().filter(e -> e.getEid().equals(eid)).findFirst().get();
        }
        return null;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }


    public boolean updateEmployee(Employee employee, String eid) {
        for (int i = 0; i < employees.size(); i++) {
            if (Objects.equals(employees.get(i).eid, eid)) {
                employees.set(i, employee);
                return true;
            }
        }
        return false;
    }

    public boolean deleteEmployee(String eid) {
        for (int i = 0; i < employees.size(); i++) {
            if (Objects.equals(employees.get(i).eid, eid)) {
                employees.remove(i);
                return true;
            }
        }
        return false;
    }

}