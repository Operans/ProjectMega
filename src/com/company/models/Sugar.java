package com.company.models;

import com.company.models.Product;
import com.company.models.enums.Measure;
import com.company.models.enums.ProductCategory;

public class Sugar extends Product {

    public Sugar(String name, double cost, Measure measure, ProductCategory productCategory) {
        super(name, cost, measure, productCategory);
    }

    public Sugar() {
    }
}
