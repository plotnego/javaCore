package com.company;

import static com.company.Employee.getTotalSum;

public class Main {

    public static void main(String[] args) {

        Employee em1 = new Employee("Aleks",10,10);

        Employee em2 = new Employee("Dima",10);
        em2.setHours(5);

        Employee em3 = new Employee();
        em3.setName("Andy");
        em3.setRate(5);
        em3.setHours(5);

        System.out.println(em1.getSalary());

        System.out.println(em2.toString());

        em1.changeRate(1);
        System.out.println(em1.getSalary());

        System.out.println(em2.getBonuses());

        System.out.println(getTotalSum(em1,em2,em3));
    }
}



