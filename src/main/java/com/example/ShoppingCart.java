package com.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
        // TODO: Initialize the list of products
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    
    // TODO: Implement methods to add a product, remove a product, and calculate the total cost
}
