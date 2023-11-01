package com.example;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private String department;

    public Employee(String name, int id, double salary, String department) {
        // TODO: Initialize the attributes
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }

    public String getDepartment(){
        return department;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setDepartment(String department){
        this.department = department;
    }
    // TODO: Implement getters, setters, and any other methods you find necessary
}
