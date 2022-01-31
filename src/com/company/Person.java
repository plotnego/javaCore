package com.company;

import java.util.Scanner;

public class Person {
    private String firstName,
                    lastName;
    private int birthYear;

    public Person(){

    }
    public Person(String firstName , String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public int getAge(){
        int Age = 2022-birthYear;
        return Age;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя : ");
        this.firstName = scanner.nextLine();
        System.out.println("Введите фамилию : ");
        this.lastName = scanner.nextLine();
        System.out.println("Введите возраст : ");
        this.birthYear = scanner.nextInt();
    }

    public String output(){
        return "Имя : "+firstName+"\nОтчество : "+lastName+"\nГод рождения : "+birthYear;
    }

    public void changedName(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String info(){


        return output()+"\nВозраст : "+getAge();
    }
}
