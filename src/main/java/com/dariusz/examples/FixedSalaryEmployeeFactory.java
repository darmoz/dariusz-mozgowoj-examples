package com.dariusz.examples;

public class FixedSalaryEmployeeFactory implements EmployeeFactory {


    public PaymentProduct createSalary(String paymentType) {
        if("fixed".equalsIgnoreCase(paymentType)) {
            return new PaymentProductFixed();
        }
        return null;
    }

    public PaymentProductBonus createSalaryWithBonus(String paymentType) {
        if("fixed".equalsIgnoreCase(paymentType)) {
            return new PaymentProductFixedBonus();
        }
        return null;
    }
}
