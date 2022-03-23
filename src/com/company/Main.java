package com.company;

public class Main {
    //сделана проверка в конструкторе , в сеттерах , в функции смены имени и в функции вывода.
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setFirstName("Iskander");
        p1.setLastName("Bombulaev");
        p1.setBirthYear(2000);

//Этот код не пройдет проверку.
//        p1.setFirstName("Iska_nder");
//        p1.setLastName("Bombul;aev");
//        p1.setBirthYear(0);
//        Person p2 = new Person("On3o", "Uno");
//        p2.setBirthYear(2023);

        Person p2 = new Person("Ono", "Uno");
        p2.setBirthYear(1999);

        Person p3 = new Person("Andy", "Exil");
        p3.setBirthYear(1997);

        Person p4 = new Person("Alex", "Rayn");
        p4.setBirthYear(1998);

        Person p5 = new Person();
        p5.input();

        p1.changedName("Neiskander", "Nebombulaev");

        System.out.println(p1.info());
        System.out.println(p2.info());
        System.out.println(p3.info());
        System.out.println(p4.info());
        System.out.println(p5.info());

    }
}
