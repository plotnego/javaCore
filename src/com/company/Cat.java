package com.company;

public class Cat implements Animal{

    private String name;

    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(getName()+" say MEOW");
    }

    @Override
    public void feed() {
        System.out.println(getName()+" like WHISKAS");
    }
}
