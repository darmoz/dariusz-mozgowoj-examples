package com.dariusz.examples;

public class HourlySalaryEmployeeFactory implements EmployeeFactory {


    public PaymentProduct createSalary(String paymentType) {
        if("hourly".equalsIgnoreCase(paymentType)) {
            return new PaymentProductHourly();
        }
        return null;
    }

    public PaymentProductBonus createSalaryWithBonus(String paymentType) {
        if("hourly".equalsIgnoreCase(paymentType)) {
            return new PaymentProductHourlyBonus();
        }
        return null;
    }

}
