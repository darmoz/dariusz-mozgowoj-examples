package com.dariusz.examples;

import java.util.List;

public class PaymentProductFixed extends PaymentProduct {


    public PaymentProductFixed() {
    }

    public void pay(double salary) {

        double cashToPay = salary;
        System.out.println("Fixed Contract payment of " + cashToPay + " PLN has been made!");
    }

}
