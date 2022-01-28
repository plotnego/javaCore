package com.task_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус круга:");
        double  r = sc.nextDouble();
        double  p = 2*Math.PI*r ,
                s = Math.PI * Math.pow(r,2);

        System.out.println("Площадь круга:"+s);
        System.out.println("Периметр круга:"+p);
    }
}
