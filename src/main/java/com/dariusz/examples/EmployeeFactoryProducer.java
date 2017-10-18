package com.dariusz.examples;

public class EmployeeFactoryProducer {

    public static EmployeeFactory getEmployeeFactory(String employeeType) {

        if("fixed".equalsIgnoreCase(employeeType)) {
            return new FixedSalaryEmployeeFactory();
        }
        if("hourly".equalsIgnoreCase(employeeType)) {
            return new HourlySalaryEmployeeFactory();
        }
        return null;
    }
}
