package com.company.models;

import com.company.models.enums.Measure;
import com.company.models.enums.ProductCategory;

public class Tee extends Product{

    public Tee (String name, double cost, Measure measure, ProductCategory productCategory) {
        super(name, cost, measure, productCategory);
    }

}
