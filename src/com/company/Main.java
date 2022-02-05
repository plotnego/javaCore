package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int dep;
        Employee [] job = new Employee[5];
                job[0]= new Employee("Andy",2,10.5);
                job[1]= new Employee("Dandy",2,14.5);
                job[2]= new Employee("Dady",2,8.5);
                job[3]= new Employee("Candy",1,15.5);
                job[4]= new Employee("Fendi",1,11.5);

        System.out.print("Введите номер департамента : ");
        dep = Integer.parseInt(sc.nextLine());
                for(Employee e : job){
                   if(e.getDepartment_number()== dep) System.out.println(e.getName());
                   else {
                       System.out.println("Такого департамента не существует.");
                   break;
                   }
                }
        System.out.println("Сортировка работников по зарплате в порядке убвания");

        Employee.sortSalaryInDescendingOrder(job);

        System.out.println();
        int [] intArr = {-8,-5,-7,12,-3,9,44,6,-1,-2};
        System.out.println(Arrays.toString(intArr));
//        int [] intArr = {1,2,3,4,5,-1,-2,-3,-4,-5};
        int max=0,sumPositive = 0,amountNegative = 0;

        for(int i = 0 ; i<intArr.length;i++){
            if(max<intArr[i]) max = intArr[i];
            if(intArr[i]>0) sumPositive += intArr[i];
            if(intArr[i]<0) amountNegative++;
        }
        if(amountNegative > intArr.length/2 ) System.out.println("Негативных чисел больше");
        else if(amountNegative == intArr.length/2) System.out.println("Положительных и отрицательных чисел поровну");
            else System.out.println("Положительных чисел больше");
        System.out.println("Максимальное число : "+max+"\nСумма положительных чисел : "+sumPositive+"\nКоличество отрицательных чисел : "+amountNegative);
    }
}
