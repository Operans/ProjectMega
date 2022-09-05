package com.company.models.interfaces;

import com.company.models.Cashier;
import com.company.models.Order;
import com.company.models.Product;
import com.company.models.Receipt;
import com.company.models.enums.ProductCategory;

public interface Operation {

    Receipt getReceipt(Order order);

    Cashier getCashier(Cashier cashier);

    Product[] getProductByCategory(String category);

    void getCategory();


}
