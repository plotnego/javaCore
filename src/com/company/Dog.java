package com.company;

public class Dog implements Animal{
    private String name;

    public String getName() {
        return name;
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(getName()+" say WOOF");
    }

    @Override
    public void feed() {
        System.out.println(getName()+" like PEDIGREE");
    }
}
