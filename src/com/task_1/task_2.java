package com.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task_2 {

    public static Exception myEx(Scanner sc,String check){
        String str;
        if(sc.hasNextInt())  throw new InputMismatchException(check+" не может состоять из цифр");
        else  str = sc.nextLine();
        if (str.length()<2) throw new InputMismatchException(check+" не может состоять из одной буквы");
        return null;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Как вас зовут?");
//        String name = sc.nextLine();
//        System.out.println("Где вы живете, "+name+"?");
//        String city = sc.nextLine();
//        System.out.println(name+" живет "+city);




        //--------------------------------------------------
        System.out.println("Как вас зовут?");
        try(Scanner sc = new Scanner(System.in);){
            String name;
            if(sc.hasNextInt())  throw new InputMismatchException("Имя не может состоять из цифр");
               else  name = sc.nextLine();
               if (name.length()<2) throw new InputMismatchException("Имя не может состоять из одной буквы");

        System.out.println("Где вы живете, "+name+"?");
        String city;

            if(sc.hasNextInt())  throw new InputMismatchException("Город не может состоять из цифр");
            else city = sc.nextLine();
            if (city.length()<2) throw new InputMismatchException("Город не может состоять из одной буквы");

        System.out.println(name+" живет "+city);
        } catch (InputMismatchException e){
            System.err.println(e.getMessage());
        }

    }
}