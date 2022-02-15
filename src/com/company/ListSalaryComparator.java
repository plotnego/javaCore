package com.company;

import java.util.Comparator;

public class ListSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o2.calculatePay()-o1.calculatePay());
    }
}
