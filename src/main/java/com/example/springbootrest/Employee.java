package com.example.springbootrest;

public class Employee {
    int empid;
    String empname;
    String designation;
    String salary;

    public Employee(int empid, String empname, String designation, String salary) {
        this.empid = empid;
        this.empname = empname;
        this.designation = designation;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
