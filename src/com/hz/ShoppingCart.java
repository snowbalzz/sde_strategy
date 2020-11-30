package com.hz;
import products.Product;

import java.util.ArrayList;

public class ShoppingCart extends ArrayList<Product> {

    private DiscountCalculator discountCalculator;

    public ShoppingCart(DiscountCalculator discountCalculator) {
        this.discountCalculator = discountCalculator;
    }

    public double getTotalPrice() {

        double totalPrice = 0.0;

        for(Product product : this) {

            double discount = discountCalculator.getDiscount(product);
            double price = product.getPrice() * discount;

            totalPrice += price;
        }

        return totalPrice;
    }
}