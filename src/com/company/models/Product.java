package com.company.models;

import com.company.models.enums.Measure;
import com.company.models.enums.ProductCategory;

public abstract class Product {
    private String name;
    private double cost;
    private Measure measure;
    private ProductCategory productCategory;



    public Product(String name, double cost, Measure measure, ProductCategory productCategory) {
        this.name = name;
        this.cost = cost;
        this.measure = measure;
        this.productCategory = productCategory;

    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }
}
