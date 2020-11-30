package com.hz;

public class Checkout {

    public void nextInLine(Customer customer) {

        String welcome = String.format("Hello %s, would you pass me your shopping cart?",
                customer.getName());
        Console.write(welcome);

        ShoppingCart cart = customer.getCart();

        double amountToPay = cart.getTotalPrice();
        String payinfo = String.format("Let's see, that will be.. %.02f. Cash or card?", amountToPay);
        Console.write(payinfo);
    }
}
