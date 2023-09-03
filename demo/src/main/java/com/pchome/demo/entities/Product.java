package com.pchome.demo.entities;

public class Product {
    private Long id;
    private String name;
    private Double price;
    private Departmant departmant;
    
    public Product(){
    }
    

    public Product(Long id, String name, Double price, Departmant departmant) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.departmant = departmant;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Departmant getDepartmant() {
        return departmant;
    }

    public void setDepartmant(Departmant departmant) {
        this.departmant = departmant;
    }

    
}
