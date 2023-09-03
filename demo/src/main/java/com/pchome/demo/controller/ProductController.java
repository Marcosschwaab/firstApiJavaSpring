package com.pchome.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pchome.demo.entities.Departmant;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @GetMapping
    public Departmant getObjects(){
        Departmant d1 = new Departmant();
        d1.setId(1L);
        d1.setName("Tech");
        return d1;
    }
}
