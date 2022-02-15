package com.company;

public class ContractEmployee extends Employee {
    public ContractEmployee(String name,double fixedMonthlyPayment,int federalTaxIdmember) {
        super(name);
        this.fixedMonthlyPayment=fixedMonthlyPayment;
        this.federalTaxIdmember=federalTaxIdmember;
    }

    @Override
    public double calculatePay() {
        return getFixedMonthlyPayment();
    }

    private double fixedMonthlyPayment;
    private int federalTaxIdmember;

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }
    @Override
    public void info(){
        System.out.println("ID : "+getEmployeeId()+"\nName : "+getName()+"\nSalary : "+calculatePay());

    }
}
