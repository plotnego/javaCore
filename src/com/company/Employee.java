package com.company;

public class Employee {
    private String name;
    private int rate;
    private int hours;

    public static int totalSum;

    public Employee() {}

    public Employee(String name,int rate){
        this.name=name;
        this.rate=rate;
    }

    public Employee(String name,int rate,int hours){
        this.name=name;
        this.rate=rate;
        this.hours=hours;
    }

    public double getSalary(){
        return this.rate* this.hours;
    }

    @Override
    public String toString(){
        return "Имя = " + name + ", Рейтинг = " + rate +", Часы = " + hours;
    }

    public void changeRate(int rate){
        setRate(rate);
        getSalary();
    }

    public double getBonuses(){
        double bonus = getSalary()+(getSalary()*0.1);
        return bonus;
    }



    public static int getTotalSum(Employee... employees){
        for(Employee emp: employees){
            totalSum+= emp.getSalary();
        }
        return totalSum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public int getRate() {
        return rate;
    }




}
