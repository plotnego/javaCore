package com.company;

import java.util.Comparator;

public class Employee implements Payment {

    static SetSalaryComparator SetSalaryComparator = new SetSalaryComparator();

    public static Comparator getSetSalaryComparator() {
        return SetSalaryComparator;
    }

    private static int count;
    private  final int employeeId ;
    private String name;

    public Employee( String name) {
        count++;
        this.employeeId=getCount();
        this.name = name;

    }

    public static int getCount() {
        return count;
    }

    public  int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void info(){

    }


    @Override
    public double calculatePay() {
        return 0;
    }
}
