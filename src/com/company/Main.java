package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа : ");
          float a = sc.nextFloat(),
                b = sc.nextFloat(),
                c = sc.nextFloat();
        if(a<=5 && a>=-5 && b<=5 && b>=-5 && c<=5 && c>=-5) System.out.println("Все числа принадлежат диапазону [-5,5]");
        else System.out.println("Не все числа принадлежат диапазону [-5,5]");

        System.out.println("Введите три целых числа : ");
            int x = sc.nextInt(),
                y = sc.nextInt(),
                z = sc.nextInt();

            int max,min;
            if(x>y) { max=x;min=y; }
            else { max =y;min =x;}
            if(max<z) max=z ;
            if(min>z) min =z;

        System.out.println("Max = "+max);
        System.out.println("Min = "+min);

        System.out.println("Введите номер HTTP ошибки");
        int error = sc.nextInt();

        if (error<400 || error>404) System.out.println("Такой ошибки не существует или база заполнена не полностью");

        for (HTTPError err: HTTPError.values()){
            if (error == err.getNumber())
                System.out.println("Имя ошибки : "+err.getName()+"\nНомер ошибки : "+err.getNumber()+"\nОписание ошибки : "+err.getDescription());
        }

        System.out.println();

        Dog dog1 = new Dog("Omi", Dog.breed.POODLE,10),
                dog2 = new Dog("Joy", Dog.breed.CHIHUAHUA,19),
                dog3 = new Dog("Omi", Dog.breed.HUSKY,8);

        Dog.oldestDog(dog1,dog2,dog3);

        if(dog1.equalsName(dog2) || dog2.equalsName(dog3) || dog3.equalsName(dog1))
            System.out.println("Собаки с одинаковым именем есть");
        else
            System.out.println("Собак с одинаковым именем нет");

    }
}
