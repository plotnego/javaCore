package com.company;

public class Student extends Person{
    private int course;

    public Student(FullName fullName, int age,int course) {
        super(fullName, age);
        this.course=course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String info(){
        return "Имя: "+fullName.getFirstName()+", Фамилия: "+fullName.getLastName()+", Возраст: "+getAge()+", Курс: "+getCourse();
    }

    @Override
    public String activity() {
        return "Я учусь в университете";
    }
}
