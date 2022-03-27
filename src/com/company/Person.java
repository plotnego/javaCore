package com.company;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class Person {

    private boolean exCheckAge(String sc) {
        Pattern pattern = Pattern.compile("\\d{1,2}");
        Matcher matcher = pattern.matcher(sc);
        return matcher.matches();
    }

    protected FullName fullName;

    private int age;

    public int getAge() {
        return age;
    }

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        try{
            if(exCheckAge(String.valueOf(age)))this.age = age;
            else throw new InputMismatchException("Введены некорректные данные");
        }catch (InputMismatchException e){
            System.err.println(e.getMessage());
        }

    }

    public String info(){
        return "Имя: "+fullName.getFirstName()+", Фамилия: "+fullName.getLastName()+", Возраст: "+getAge();
    }

    abstract public String activity();
}
