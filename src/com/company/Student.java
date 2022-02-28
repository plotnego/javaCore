package com.company;
import java.util.List;
import java.util.ListIterator;
public class Student {

    private String name;

    private int course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }
    public static void printStudents(List<Student> std, int course){
        ListIterator<Student> stdIter = std.listIterator();

        while(stdIter.hasNext()){
            if(course == stdIter.next().getCourse()){
                System.out.println("Name "+stdIter.next().getName());
            }
        }

    }
}

