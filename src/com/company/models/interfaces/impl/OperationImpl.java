package com.company.models.interfaces.impl;

import com.company.models.*;
import com.company.models.enums.Measure;
import com.company.models.enums.ProductCategory;
import com.company.models.interfaces.Operation;

public class OperationImpl implements Operation {
    Sugar sugar = new Sugar("Кант",400, Measure.Kg, ProductCategory.Groats);
    Water water = new Water("Legenda",25,Measure.Li, ProductCategory.Drinks);
    Tee tee = new Tee("Lipton", 100, Measure.Li, ProductCategory.Drinks);

    @Override
    public Receipt getReceipt(Order order) {
        return null;
    }

    @Override
    public Cashier getCashier(Cashier cashier){
        return null;
    }

    @Override
    public Product[] getProductByCategory(ProductCategory productCategory){
        return null;
    }

    @Override
    public ProductCategory[] getCategory(){
        return ProductCategory.values();
    }
    




}
