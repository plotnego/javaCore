package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа : ");
        try {
            float a = sc.nextFloat(),
                    b = sc.nextFloat(),
                    c = sc.nextFloat();
            if (a <= 5 && a >= -5 && b <= 5 && b >= -5 && c <= 5 && c >= -5)
                System.out.println("Все числа принадлежат диапазону [-5,5]");
            else System.out.println("Не все числа принадлежат диапазону [-5,5]");
        } catch (InputMismatchException e) {
            System.err.println("Некорректные данные");
        }

        System.out.println("Введите три целых числа : ");
        Scanner sc1 = new Scanner(System.in);
        try {
                    int x = sc1.nextInt(),
                    y = sc1.nextInt(),
                    z = sc1.nextInt();

            int max, min;
            if (x > y) {
                max = x;
                min = y;
            } else {
                max = y;
                min = x;
            }
            if (max < z) max = z;
            if (min > z) min = z;

            System.out.println("Max = " + max);
            System.out.println("Min = " + min);
        } catch (InputMismatchException e) {
            System.err.println("Некорректные данные");
        }

        System.out.println("Введите номер HTTP ошибки");
        Scanner sc2 = new Scanner(System.in);
        try {
            int error = sc2.nextInt();

            if (error < 400 || error > 404)
                System.out.println("Такой ошибки не существует или база заполнена не полностью");

            for (HTTPError err : HTTPError.values()) {
                if (error == err.getNumber())
                    System.out.println("Имя ошибки : " + err.getName() + "\nНомер ошибки : " + err.getNumber() + "\nОписание ошибки : " + err.getDescription());
            }
        }catch (InputMismatchException e){
            System.err.println("Некорректные данные");
        }

        System.out.println();

        Dog dog1 = new Dog("Omi", Dog.breed.POODLE, 10),
                dog2 = new Dog("Joy", Dog.breed.CHIHUAHUA, 19),
                dog3 = new Dog("Omi", Dog.breed.HUSKY, 8);

        Dog.oldestDog(dog1, dog2, dog3);

        if (dog1.equalsName(dog2) || dog2.equalsName(dog3) || dog3.equalsName(dog1))
            System.out.println("Собаки с одинаковым именем есть");
        else
            System.out.println("Собак с одинаковым именем нет");

    }
}
