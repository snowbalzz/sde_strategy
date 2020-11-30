package com.hz;

import products.BlenderWithIntegratedRadio;
import products.CuteTeddyBear;
import products.TVScreen;

public class Main {

    public static void main(String[] args) {

        Customer piet = new Customer(CustomerType.Regular, "Piet");
        Customer anne = new Customer(CustomerType.New, "Anne");


        piet.buys(new CuteTeddyBear());

        anne.buys(new CuteTeddyBear());

        Checkout kassa5 = new Checkout();

        kassa5.nextInLine(piet);


        kassa5.nextInLine(anne);

    }
}
