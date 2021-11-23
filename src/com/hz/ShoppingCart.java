package com.hz;
import discounts.Discount;
import products.Product;

import java.util.ArrayList;

public class ShoppingCart extends ArrayList<Product> {

    private Customer customer;

    public ShoppingCart(Customer _customer){
        this.customer = _customer;
    }

    public double getTotalPrice(Discount _discount) {

        int productCount = this.size();

        double totalPrice = 0.0;

        for(Product product : this) {

            double price;

            int index = this.indexOf(product);

            double discount = _discount.recieveDis(this.customer, index, productCount);

            if (discount == 0){
                price = product.getPrice();
            } else {
                price = product.getPrice() * (1-discount);
            }

            totalPrice += price;
        }

        return totalPrice;
    }
}