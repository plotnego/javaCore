package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Employee {
    private String Name;
    private int department_number;
    private double salary;

    public Employee(String name, int department_number, double salary) {
        Name = name;
        this.department_number = department_number;
        this.salary = salary;
    }

    public static void sortSalaryInDescendingOrder(Employee[] emp){

        Employee temp;
        for(int i =0 ; i<emp.length-1 ; i++)
            for(int j = i+1 ; j<emp.length ; j++){
                if( emp[i].getSalary()<emp[j].getSalary() ){
                    temp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = temp;
                }
            }
        for (Employee e : emp){
            System.out.println(e.getName()+" : "+e.getSalary());
        }

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDepartment_number() {
        return department_number;
    }

    public void setDepartment_number(int department_number) {
        this.department_number = department_number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
