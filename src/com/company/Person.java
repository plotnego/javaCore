package com.company;

abstract public class Person {
    public String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
            }

    abstract void print();

}
