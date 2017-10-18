package com.dariusz.examples.employee;

public class HourContractEmployee {

    private String name;
    private String typeOfPayment;
    private double hours;
    private double payHour;
    private double bonus;

    public HourContractEmployee(String name, String typeOfPayment, double hours, double payHour, double bonus) {
        this.name = name;
        this.typeOfPayment = typeOfPayment;
        this.hours = hours;
        this.payHour = payHour;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public String getTypeOfPayment() {
        return typeOfPayment;
    }

    public double getHours() {
        return hours;
    }

    public double getPayHour() {
        return payHour;
    }

    public double getBonus() { return bonus; }
}
