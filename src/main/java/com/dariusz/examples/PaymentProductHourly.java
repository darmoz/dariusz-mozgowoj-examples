package com.dariusz.examples;

public class PaymentProductHourly extends PaymentProduct {


    public void pay(double salary) {

        double cashToPay = salary;
        System.out.println("Fixed Contract payment of " + cashToPay + " PLN has been made!");
    }
}
