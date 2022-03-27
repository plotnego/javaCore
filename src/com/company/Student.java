package com.company;

import java.util.InputMismatchException;

public class Student extends Person{
    private int course;

    public Student(FullName fullName, int age,int course) {
        super(fullName, age);
        try{
            if(course>=1 && course<=5) this.course=course;
            else throw new InputMismatchException("Введены некорректные данные");
        }catch (InputMismatchException e){
            System.err.println(e.getMessage());
        }

    }

    public int getCourse() {
        return course;
    }

    @Override
    public String info(){
        if (fullName.getFirstName()==null || fullName.getLastName()==null || getAge()==0 || getCourse()==0)
            return "Объект заполнен не полностью";
        else return "Имя: "+fullName.getFirstName()+", Фамилия: "+fullName.getLastName()+", Возраст: "+getAge()+", Курс: "+getCourse();
    }

    @Override
    public String activity() {
        return "Я учусь в университете";
    }
}
