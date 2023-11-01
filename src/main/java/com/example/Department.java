package com.example;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private ArrayList<Employee> employeeList;

    public Department(String name) {
        this.name = name;
        this.employeeList = new ArrayList <Employee>();
        // TODO: Initialize the attributes
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }

    public String getName(){
        return this.name;

    }

    public ArrayList <Employee> getEmployees(){
        return this.employeeList;
    }

    public double calcAverageSalary(){
        if (employeeList.isEmpty()){
            return 0;
        }

        double totalSalary = 0;

        for (Employee employee : employeeList){
            totalSalary += employee.getSalary();
        }

        return totalSalary / employeeList.size();
    }
    // TODO: Implement methods to add an employee, remove an employee, and calculate the average salary for the department
}
