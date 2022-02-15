package com.company;

public class Cleaner extends Staff{
    public Cleaner(String name) {
        super(name);
    }
    private final String TYPE_PERSON = "cleaner ";
    @Override
    void print() {
        System.out.println("I am "+TYPE_PERSON+getName());
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    String salary() {
        return "My salary : \u20B4"+1500;
    }
}
