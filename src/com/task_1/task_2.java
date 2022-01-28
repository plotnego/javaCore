package com.task_1;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = sc.nextLine();
        System.out.println("Где вы живете, "+name+"?");
        String city = sc.nextLine();
        System.out.println(name+" живет "+city);
    }
}
