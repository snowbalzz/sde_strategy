package com.hz;

import products.Product;

public class DiscountCalculator {

    private Customer customer;

    public DiscountCalculator(Customer customer) {
        this.customer = customer;
    }

    public double getDiscount(Product product) {

        double discount = 0.0;

        // Default situation: new customers full price, regular 15% off
        if(customer.isRegular()) {
            discount = .15;
        }

        return 1 - discount;
    }
}
