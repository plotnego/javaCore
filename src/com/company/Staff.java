package com.company;

abstract public class Staff extends Person{
    public Staff(String name) {
        super(name);
    }
    abstract String salary();
}
