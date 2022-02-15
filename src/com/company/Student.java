package com.company;

public class Student extends Person{
    public Student(String name) {
        super(name);
    }
    private final String TYPE_PERSON = "student ";

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    void print() {
        System.out.println("I am "+TYPE_PERSON+getName());
    }
}
