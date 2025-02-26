package com.Abstraction;

abstract class Employee {
    String name;
    int hoursWorked;

    public Employee(String name, int hoursWorked) {
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    public abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int hoursWorked, double monthlySalary) {
        super(name, hoursWorked);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Full-time Employee Salary: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;

    public PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name, hoursWorked);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void calculateSalary() {
        double salary = hoursWorked * hourlyRate;
        System.out.println("Part-time Employee Salary: " + salary);
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("John Doe", 160, 4000);
        Employee partTimeEmployee = new PartTimeEmployee("Jane Smith", 80, 20);

        fullTimeEmployee.calculateSalary();
        partTimeEmployee.calculateSalary();
    }
}

