package com.company;

import com.company.models.Product;
import com.company.models.enums.ProductCategory;
import com.company.models.interfaces.impl.OperationImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        OperationImpl operation = new OperationImpl();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("Chose catrgory:");
        operation.getCategory();

        String category = sc.next();
        Product[] products = operation.getProductByCategory(category);
        for (Product p : products) {
            if (p != null) {
                 p.getInfo();
            }
        }





    }
}
