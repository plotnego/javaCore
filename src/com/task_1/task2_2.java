package com.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task2_2 {
    public static String myExCheck(Scanner sc,String check) throws InputMismatchException {
        String str;
        if(sc.hasNextInt())  throw new InputMismatchException(check+" не может состоять из цифр");
        else  str = sc.nextLine();
        if (str.length()<2) throw new InputMismatchException(check+" не может состоять из одной буквы");
        return str;
    }
    public static void main(String[] args) {

        System.out.println("Как вас зовут?");
        try(Scanner sc = new Scanner(System.in);){
            String name = myExCheck(sc,"Имя");
            System.out.println("Где вы живете, "+name+"?");
            String city = myExCheck(sc,"Город");
            System.out.println(name+" живет в "+city);
        } catch (InputMismatchException e){
            System.err.println(e.getMessage());
        }
    }
}