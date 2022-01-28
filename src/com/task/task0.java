package com.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class task0 {
          public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите а: ");
        int a = in.nextInt();
        System.out.print("Введите б: ");
        int b = in.nextInt();
        int     w=a+b,
                x=a-b,
                y=a*b;
        float z =(float) a/b;
        System.out.println("a+b="+w);
        System.out.println("a-b="+x);
        System.out.println("a*b="+y);
        System.out.println("a/b="+z);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Как себя чувствуешь?");
        String hau = br.readLine();
        System.out.println("Сколько тебе лет?");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Самочувствие: " + hau);
        System.out.println("Тебе: " + age);

        }
    }


