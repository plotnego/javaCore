package com.company;

public class Main {

    public static void main(String[] args) {

    Bird [] birds = {new Eagle(),new Swallow(),new Penguin(),new Chicken()};
    for(Bird bird:birds){
        bird.fly();
    }
        for(Bird bird:birds){
            bird.info();
        }
        System.out.println();
        Employee emp = new Employee("Andy",58,9000);
        Developer dev = new Developer("Bliz",25,1000,"Back-end Java developer");
        System.out.println(emp.report());
        System.out.println(dev.report());
    }
}

