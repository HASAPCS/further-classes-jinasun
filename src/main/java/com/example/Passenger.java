package com.example;

public class Passenger {
    private String name;
    private String passportNumber;

    public Passenger(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
        // TODO: Initialize the attributes
    }

    public String getName(){
        return name;
    }

    public String getPassportNumber(){
        return passportNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPassportNumber(String passportNumber){
        this.passportNumber = passportNumber;
    }
    // TODO: Implement getters, setters, and any other methods you find necessary
}
