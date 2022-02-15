package com.company;

public class Teacher extends Staff{
    public Teacher(String name) {
        super(name);
    }
    private final String TYPE_PERSON = "teacher ";
    @Override
    void print() {
        System.out.println("I am "+TYPE_PERSON+getName());
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    String salary() {
        return  "My salary : \u20B4"+5000;
    }
}
