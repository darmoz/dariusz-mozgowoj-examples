package com.dariusz.examples;

public interface EmployeeFactory {
    PaymentProduct createSalary(String paymentType);
    PaymentProductBonus createSalaryWithBonus(String paymentType);
}
