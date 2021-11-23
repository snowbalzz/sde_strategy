package com.hz;

import discounts.CurrentDiscount;
import discounts.Discount;

public class Checkout {

    private Discount discounter;

    public Checkout(Discount discount) {
        this.discounter = discount;
    }

    public void nextInLine(Customer customer) {

        // Welcome customer
        String welcome = String.format("Hello %s, would you pass me your shopping cart?",
                customer.getName());
        Console.write(welcome);

        // perform checkout
        ShoppingCart cart = customer.getCart();

        double amountToPay = cart.getTotalPrice(discounter);
        String payinfo = String.format("Let's see, that will be.. %.02f. Cash or card?", amountToPay);
        Console.write(payinfo);
    }
}
