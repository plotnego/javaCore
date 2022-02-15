package com.company;

public class Main {

    public static void main(String[] args) {
    Animal[] animals = {
            new Cat("Miki"),new Dog("Lisa"),new Cat("Kurkuma"),new Dog("Gus")
    };
    for(Animal a:animals){
        a.voice();
        a.feed();
    }

        System.out.println();

    Person [] people = {
            new Student("Rex"),new Student("Fex"),new Teacher("Tamara"),new Cleaner("Fedor")
    };
    for(Person p:people){

        p.print();
        if(p instanceof Teacher || p instanceof Cleaner) System.out.println(((Staff) p).salary());
    }
    }
}
