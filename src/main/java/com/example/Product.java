package com.example;

public class Product {
    private String name;
    private double price;
    private int productID;

    public Product(String name, double price, int productID) {
        
        this.name = name;
        this.price = price;
        this.productID = productID;
        // TODO: Initialize the attributes
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getProductID() {
        return productID;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }
    
    // TODO: Implement getters, setters, and any other methods you find necessary
}
