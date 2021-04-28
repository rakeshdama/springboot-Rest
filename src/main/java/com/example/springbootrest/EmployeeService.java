package com.example.springbootrest;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employees = new ArrayList<>();

    public void createStudent(){
        employees.add(new Employee(111, "rakesh", "Pentester", "100000$"));
        employees.add(new Employee(112, "dama", "hacker", "110000$"));
        employees.add(new Employee(113, "royal", "Soc Analyst", "120000$"));
    }

    public List<Employee> getEmployees() {
        createStudent();
        return employees;
    }
}
