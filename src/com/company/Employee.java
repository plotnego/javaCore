package com.company;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    private String name;
    private int age;
    private double salary;

    private boolean exCheckAge(String sc) {
        Pattern pattern = Pattern.compile("^[1-9]\\d");
        Matcher matcher = pattern.matcher(sc);
        return matcher.matches();
    }
    private boolean exCheckName(String sc) {
        Pattern pattern = Pattern.compile("^[A-ZА-Я][a-zа-я]+");
        Matcher matcher = pattern.matcher(sc);
        return matcher.matches();
    }

    private static boolean exCheckSalary(String sc) {
        Pattern pattern = Pattern.compile("^[1-9]\\d{2,4}(\\.\\d*)?");
        Matcher matcher = pattern.matcher(sc);
        return matcher.matches();
    }

    public Employee(String name, int age, double salary) {
        try{
            if(!exCheckName(name) || !exCheckAge(String.valueOf(age)) || !exCheckSalary(String.valueOf(salary)))
                throw new InputMismatchException("Введены некорректные данные при создании объекта");
          else {
                this.name = name;
                this.age = age;
                this.salary = salary;
            }
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }

    }

    public String report() {
        return String.format("Name: %s,Age: %d, Salary: \u20B4 %.2f.",name,age,salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            if (!exCheckName(name))
                throw new InputMismatchException("Введено некорректное имя /Setter " + name);
            else this.name = name;
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try {
            if (!exCheckAge(String.valueOf(age)))
                throw new InputMismatchException("Введено некорректный возраст /Setter " + name);
            else this.age = age;
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        try {
            if (!exCheckSalary(String.valueOf(salary)))
                throw new InputMismatchException("Введено некорректная зарплата /Setter " + name);
            else this.salary = salary;
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }

    }
}
