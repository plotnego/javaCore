package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] dayInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Введите номер месяца : ");
        Scanner sc = new Scanner(System.in);
        int numberOfMonth = sc.nextInt();
        System.out.println("В этом месяце : "+dayInMonth[numberOfMonth-1]+" дней");

        System.out.println("\nВведите 10 целых чисел");
        int [] arrInt = new int[10];
        //Для проверки
//        int [] arrInt = {1,1,-5,1,1,1,2,3,4,5};
//        int [] arrInt = {1,1,5,1,1,1,2,3,4,5};
        for(int i=0;i<arrInt.length;i++){
            arrInt[i]= sc.nextInt();
        }

        int sum=0,product=1;
        for(int k = 0;k<5;k++){
            if(arrInt[k]>0) sum+=arrInt[k];
            else {sum = 0;
                break;}
        }
        int j=5;
        while(j < arrInt.length){
            product *=arrInt[j];
            j++;
        }
        if(sum > 0) System.out.println("Сумма первых пяти положительных чисел "+sum);
          else System.out.println("Произведение последних пяти чисел "+product);


        System.out.println("\nВведите 5 целых чисел");
        int[] fiveInt = new int[5];
        for (int i = 0; i < fiveInt.length; i++) {
            fiveInt[i] = sc.nextInt();
            if (fiveInt[i] < 0) break;
        }
        System.out.println(Arrays.toString(fiveInt));

        if (fiveInt[1] > 0) System.out.println("Индекс позиции второго положительного числа : 1");
        else if (fiveInt[1] < 0 || fiveInt[0] < 0){
            System.out.println("Индекс позиции второго положительного числа : 2");
        System.out.println("Вывод с позиции , что 0 положительное число.");}

        int min = fiveInt[0];
        for (int i = 0; i < fiveInt.length; i++) {
            if (fiveInt[i] < min) min = fiveInt[i];
        }
        System.out.println("Минимальный элемент : "+min);
        int u =0;
        while (u< fiveInt.length){
            if (fiveInt[u] == min) System.out.println("Индекс позиции минимального элемента : "+u);
            u++;
        }

        // Не понимаю почему не правильно работает при отрицательных числах
//        int minIndex = Arrays.binarySearch(fiveInt,min);
//        System.out.println("Индекс позиции минимального элемента : "+minIndex);

        int productPos=1;
        for (int i =0 ; i< fiveInt.length;i++){
            if(fiveInt[i]>0) productPos*=fiveInt[i];
            else break;
        }
        System.out.println("Произведение всех четных чисел : "+productPos);
        Car [] car = new Car[4];
        car[0] = new Car(Car.Type.COUPE,2007,1975);
        car[1]= new Car(Car.Type.CROSSOVER,2019,3456);
        car[2] = new Car(Car.Type.PICKUP,2018,1968);
        car[3] = new Car(Car.Type.HATCHBACK,2012,1197);

        System.out.print("\nВведите год выпуска машины: ");
        int year = sc.nextInt();
        for(Car ca :car){
            if(year == ca.getYear()) System.out.println("Тип : "+ca.getType()+"\nГод выпуска : "+ca.getYear()+"\nОбьем двигателя : "+ca.getEngineCapacity());
        }
        System.out.println("\nВывод по году выпуска\n");

        Car.info(Car.orderByTheYear(car));

        System.out.println("\nНеотсортированный масив машин\n");
        Car.info(car);
    }
}
