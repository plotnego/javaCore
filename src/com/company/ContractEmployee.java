package com.company;

public class ContractEmployee extends Employee implements Payment {
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
        try{
            if(this.getName()==null) throw new NullPointerException("Объект заполнен не полностью");
            System.out.println("ID : "+getEmployeeId()+"\nName : "+getName()+"\nSalary : "+calculatePay());
        } catch (NullPointerException e){
            System.err.println(e.getMessage());
        }


    }

}
