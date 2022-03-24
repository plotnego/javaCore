package com.company;

public class SalariedEmployee extends Employee implements Payment {
    public SalariedEmployee(String name, double hourlyRate, double numberOfHoursWorked, int socialSecurityNumber) {
        super(name);
        this.hourlyRate=hourlyRate;
        this.numberOfHoursWorked=numberOfHoursWorked;
        this.socialSecurityNumber=socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return getHourlyRate() * getNumberOfHoursWorked();
    }
    private double hourlyRate;
    private double numberOfHoursWorked;
    private int socialSecurityNumber;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public void info(){
        System.out.println("ID : "+getEmployeeId()+"\nName : "+getName()+"\nSalary : "+calculatePay());

    }
}
