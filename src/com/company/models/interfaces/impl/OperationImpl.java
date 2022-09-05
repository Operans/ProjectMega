package com.company.models.interfaces.impl;

import com.company.models.*;
import com.company.models.enums.Measure;
import com.company.models.enums.ProductCategory;
import com.company.models.interfaces.Operation;

import java.util.Arrays;
import java.util.Scanner;

public class OperationImpl implements Operation {
    Sugar sugar = new Sugar("Кант",400, Measure.Kg, ProductCategory.DAIRY);
    Water water = new Water("Legenda",25,Measure.Li, ProductCategory.DAIRY);
    Tee tee = new Tee("Lipton", 100, Measure.Li, ProductCategory.FRUITS);
    Yogurt yogurt = new Yogurt("Bio yogurt",21,Measure.Li, ProductCategory.DAIRY);
    Product[] products = {sugar,water,tee,yogurt};

    @Override
    public Receipt getReceipt(Order order) {
        return null;
    }

    @Override
    public Cashier getCashier(Cashier cashier){
        return null;
    }

    @Override
    public Product[] getProductByCategory(String category){
        int i = 0;
        Product [] result = new Product[10];
        for (Product product : products) {
            if (product.getProductCategory().equals(ProductCategory.valueOf(category))){
                result[i] = product;
                i++;
            }
        }
        return result;
    }

    @Override
    public  void getCategory(){
        for (ProductCategory item: ProductCategory.values()) {
            System.out.print(item.name() + " ");
        }
    }













}
