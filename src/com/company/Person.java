package com.company;

abstract public class Person {

    protected FullName fullName;

    private int age;

    public int getAge() {
        return age;
    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info(){
        return "Имя: "+fullName.getFirstName()+", Фамилия: "+fullName.getLastName()+", Возраст: "+getAge();
    }

    abstract public String activity();
}
