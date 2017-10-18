package com.dariusz.examples.employee;

public class Employee {

    private String name;
    private String typeOfPayment;
    private double salary;
    private double bonus;

    public Employee(String name, String typeOfPayment, double salary, double bonus) {
        this.name = name;
        this.typeOfPayment = typeOfPayment;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public String getTypeOfPayment() {
        return typeOfPayment;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() { return bonus; }
}
