package com.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {

        System.out.print("Введите радиус круга:");
        try (Scanner sc = new Scanner(System.in);){
            double  r = sc.nextDouble();
            if(r<=0) throw new ArithmeticException("Radius cannot be zero and negative");
            double  p = 2*Math.PI*r ,
                    s = Math.PI * Math.pow(r,2);
            System.out.println("Площадь круга:"+s);
            System.out.println("Периметр круга:"+p);
        } catch (InputMismatchException e){
            System.err.print("Not a number");
        } catch (ArithmeticException e){
            System.err.print(e);
        }



    }
}
