package com.company;

public class Main {

    public static void main(String[] args) {
        Wrapper<Integer> intWrapper = new Wrapper<>(100);
        Wrapper<String> strWrapper = new Wrapper<>("Hello");
        Wrapper<Boolean> booWrapper = new Wrapper<>(true);

        System.out.println(intWrapper.getValue());
        System.out.println(strWrapper.getValue());
        System.out.println(booWrapper.getValue());

        Student st1 = new Student(new FullName("Valik","Trizub"),22,2);
        Student st2 = new Student(new FullName("Katalik","Serbovich"),28,5);

        System.out.println(st1.info()+" | "+st1.activity());
        System.out.println(st2.info()+" | "+st2.activity());

    }
}
