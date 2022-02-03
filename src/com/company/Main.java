package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product("AA+", 50, 100);
        Product p2 = new Product("BB+", 25, 300);
        Product p3 = new Product("CC+", 15, 200);
        Product p4 = new Product("DD-", 80, 50);


        Product most = Product.mostExpensive(p1, p2, p3, p4);
        System.out.println("Самый дорогой товар : " + most.getName() + "\nКоличество : " + most.getQuantity());

        Product bigQ = Product.biggestQuantity(p1, p2, p3, p4);
        System.out.println("Самое большое количество у товара : " + bigQ.getName());


        Scanner odd = new Scanner(System.in);
        System.out.println("Введите три числа");
        int a = odd.nextInt(),
                b = odd.nextInt(),
                c = odd.nextInt(),
                count = 0;
        count = a%2 != 0 ? ++count : count;
        count = b%2 != 0 ? ++count : count;
        count = c%2 != 0 ? ++count : count;
        System.out.println("Нечетных чисел : "+count);


        Scanner n = new Scanner(System.in);
        System.out.print("Введите номер дня недели : ");
        int day = n.nextInt();

        switch(day){

            case 1 :
                System.out.println("en: Monday\nua: Понеділок\nru: Понедельник");
                break;
            case 2 :
                System.out.println("en: Tuesday\nua: Вівторок\nru: Вторник");
                break;
            case 3 :
                System.out.println("en: Wednesday\nua: Середа\nru: Среда");
                break;
            case 4 :
                System.out.println("en: Thursday\nua: Четверг\nru: Четверг");
                break;
            case 5 :
                System.out.println("en: Friday\nua: П'ятниця\nru: Пятница");
                break;
            case 6 :
                System.out.println("en: Saturday\nua: Субота\nru: Суббота");
                break;
            case 7 :
                System.out.println("en: Sunday\nua: Неділя\nru: Воскресенье");
                break;
            default:
                System.out.println("en: INCORRECT VALUE\nua: НЕКОРРЕКТНЕ ЗНАЧЕННЯ\nru: НЕКОРРЕКТНОЕ ЗНАЧЕНИЕ");
        }

            Scanner country = new Scanner(System.in);
            System.out.println("Введите название страны");
            String countryName = country.nextLine();

            switch (countryName){

                case "Украина": case "Беларусь":
                    continents Eurasia = continents.Eurasia;
                    System.out.println(Eurasia.getName());
                    break;
                case "Канада": case "Мексика":
                    continents NorthAmerica = continents.NorthAmerica;
                    System.out.println(NorthAmerica.getName());
                    break;
                case "Бразилия": case "Колумбия":
                    continents SouthAmerica = continents.SouthAmerica;
                    System.out.println(SouthAmerica.getName());
                    break;
                case "Кения": case "Нигерия":
                    continents Africa = continents.Africa;
                    System.out.println(Africa.getName());
                    break;
                case "Фиджи": case "Самоа":
                    continents Australia = continents.Australia;
                    System.out.println(Australia.getName());
                    break;
                default:
                    System.out.println("База данных заполнена не полностью");
            }



    }
}
