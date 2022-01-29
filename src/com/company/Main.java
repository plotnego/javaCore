package com.company;

public class Main {

    public static void main(String[] args) {

            Person p1 = new Person();
            p1.setFirstName("Iskander");
            p1.setLastName("Bombulaev");
            p1.setBirthYear(2000);

            Person p2 = new Person("Ono","Uno");
            p2.setBirthYear(1999);

            Person p3 = new Person("Andy","Exil");
            p3.setBirthYear(1997);

            Person p4 = new Person("Alex","Rayn");
            p4.setBirthYear(1998);

            Person p5 = new Person("Il","Rew");
            p5.setBirthYear(1995);

        p1.changedName("Neiskander","Nebombulaev");

        System.out.println(p1.info());
        System.out.println(p2.info());
        System.out.println(p3.info());
        System.out.println(p4.info());
        System.out.println(p5.info());
    }
}
