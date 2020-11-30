package com.hz;

public class Customer {

    private CustomerType customerType;
    private String name;

    public Customer(CustomerType customerType, String name) {
        this.customerType = customerType;
        this.name = name;

    }

    private boolean isRegular() {

        return this.customerType == CustomerType.Regular;
    }
}
