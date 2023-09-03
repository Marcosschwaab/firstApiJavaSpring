package com.pchome.demo.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pchome.demo.entities.Departmant;
import com.pchome.demo.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @GetMapping
    public List<Product> getObjects(){
        Departmant d1 = new Departmant(1L, "Tech" );
        Departmant d2 = new Departmant(2L, "Pet");

        Product p1 = new Product(1L, "Macbook Pro", 6000.0, d1);
        Product p2 = new Product(2L, "PC Gamer", 5000.0, d1);
        Product p3 = new Product(3L, "Pet House", 5000.0, d2);

        List<Product> list = Arrays.asList(p1, p2 ,p2);
        return list;
    }
}
