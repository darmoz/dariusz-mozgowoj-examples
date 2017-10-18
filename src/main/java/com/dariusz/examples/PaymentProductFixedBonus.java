package com.dariusz.examples;

public class PaymentProductFixedBonus extends PaymentProductBonus {


    public void pay(double salary, double bonus) {

        double cashToPay = salary + salary*bonus;
        System.out.println("Fixed Contract payment with bonus of " + cashToPay + " PLN has been made!");
    }
}
