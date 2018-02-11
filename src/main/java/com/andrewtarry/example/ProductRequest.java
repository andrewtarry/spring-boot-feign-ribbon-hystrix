package com.andrewtarry.example;

import com.andrewtarry.example.model.ProductList;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "products", fallback = ProductRequestFallback.class)
public interface ProductRequest {

    @RequestMapping(method = RequestMethod.GET, path = "/products")
    ProductList getProducts();
}