package com.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        double c1,c2,c3,t1,t2,t3,p1,p2,p3,sum;
        try(Scanner sc3 = new Scanner(System.in);) {
            System.out.print("Введите стоимость звонка из первой страны:");
            c1 = sc3.nextDouble();
            System.out.print("Введите стоимость звонка из второй страны:");
            c2 = sc3.nextDouble();
            System.out.print("Введите стоимость звонка из третьей страны:");
            c3 = sc3.nextDouble();
            System.out.print("Введите продолжительность первого звонка:");
            t1 = sc3.nextDouble();
            System.out.print("Введите продолжительность второго звонка:");
            t2 = sc3.nextDouble();
            System.out.print("Введите продолжительность третьего звонка:");
            t3 = sc3.nextDouble();

            p1 = c1*t1;
            p2 = c2*t2;
            p3 = c3*t3;
            sum=p1+p2+p3;
            System.out.println("Стоимость первого звонка: "+t1+" мин. по "+c1+" у.е./мин.\nИтого: "+p1+" у.е.");
            System.out.println("Стоимость второго звонка: "+t2+" мин. по "+c2+" у.е./мин.\nИтого: "+p2+" у.е.");
            System.out.println("Стоимость третьего звонка: "+t3+" мин. по "+c3+" у.е./мин.\nИтого: "+p3+" у.е.");
            System.out.println("Стоимость всех звонков: "+sum+" у.е.");
        } catch (InputMismatchException e){
            System.err.println("Not a number");
        }


    }
}
