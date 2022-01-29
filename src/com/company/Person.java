package com.company;

public class Person {
    private String firstName,
                    lastName;
    public int birthYear;

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

    public void input(String name ,String lastName , int birthYear){
        this.firstName=name;
        this.lastName=lastName;
        this.birthYear=birthYear;
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
