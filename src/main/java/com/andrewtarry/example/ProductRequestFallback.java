package com.andrewtarry.example;

import com.andrewtarry.example.model.ProductList;

/**
 * Fallback for the product request, get an empty list
 */
public class ProductRequestFallback implements ProductRequest {

    @Override
    public ProductList getProducts() {
        return new ProductList();
    }
}
