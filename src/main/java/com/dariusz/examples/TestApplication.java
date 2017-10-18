package com.dariusz.examples;


import com.dariusz.examples.employee.Employee;
import com.dariusz.examples.employee.HourContractEmployee;

import java.util.ArrayList;

public class TestApplication {

    public static void main(String[] args) {

        Employee employee;
        ArrayList<Employee> employeesFix = new ArrayList<Employee>();
        Employee fixedEmployee1 = new Employee("Adam", "fixed", 2000, 0.1);
        Employee fixedEmployee2 = new Employee("Piotr", "fixed", 2600, 0.3);
        employeesFix.add(fixedEmployee1);
        employeesFix.add(fixedEmployee2);
        HourContractEmployee hourContractEmployee;
        ArrayList<HourContractEmployee> employeesHour = new ArrayList<HourContractEmployee>();
        HourContractEmployee hourEmployee1 = new HourContractEmployee("Robert","hourly",50, 8,0.3);
        HourContractEmployee hourEmployee2 = new HourContractEmployee("Andrzej", "hourly", 38, 12, 0.1);
        employeesHour.add(hourEmployee1);
        employeesHour.add(hourEmployee2);

        EmployeeFactory fixedSalaryEmployeeFactory = EmployeeFactoryProducer.getEmployeeFactory(employeesFix.get(0).getTypeOfPayment());
        PaymentProduct fixedPayment = fixedSalaryEmployeeFactory.createSalary(employeesFix.get(0).getTypeOfPayment());
        fixedPayment.pay(employeesFix.get(0).getSalary());

        EmployeeFactory hourlySalaryEmployeeFactory = EmployeeFactoryProducer.getEmployeeFactory(employeesHour.get(1).getTypeOfPayment());
        PaymentProductBonus bonusHourlyPayment = hourlySalaryEmployeeFactory.createSalaryWithBonus(employeesHour.get(1).getTypeOfPayment());
        bonusHourlyPayment.pay(employeesHour.get(1).getHours()*employeesHour.get(1).getPayHour(), employeesHour.get(1).getBonus());


    }
}
