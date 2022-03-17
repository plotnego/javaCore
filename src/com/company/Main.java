package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;


// Вопросы.
// Незнаю почему иногда если второе число 0 , исключение показывается после вывода текста из следующей функции.

// Если во второй функции которая проверяет принадлежит ли число данному диапазону ввести не число выводится два исключения.
// О том что это не число и о том что число вне пределах границ . Как сделать так чтобы выводилось только одни исключение .

public class Main {

    public static void main(String[] args) {

// first
        System.out.println("Введите два числа для деления");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            double a = Double.parseDouble(bf.readLine());
            double b = Double.parseDouble(bf.readLine());
            double dres = div(a,b);
            System.out.println(dres);
        } catch (NumberFormatException fe){
            System.err.println(fe+": Не число");
        } catch (ArithmeticException ae){
                System.err.println(ae);
        } catch (IOException e) {
            e.printStackTrace();
        }

//second
        try {
            int ires = readNumber(4,25);
            System.out.println(ires);
        }
        catch (IndexOutOfBoundsException | NumberFormatException e ) {
            System.err.println(e);
        }

//third
        try{
            System.out.println("Введите 10 чисел a1,a2,...,a10, так чтобы 1 < a1 < ... < a10 < 100");
            int[] num = new int[10];
            num[0]=readNumber(2,99);
            for(int i=1;i<num.length;i++){
                num[i]=readNumber(2,99);
                if(num[i]==num[i-1] || num[i]<num[i-1])
                    throw new InputMismatchException("Несоблюдение 1 < a1 < ... < a10 < 100");
            }
            System.out.println(Arrays.toString(num));

        } catch (IndexOutOfBoundsException e) {
            System.err.println(e);
        } catch (InputMismatchException e){
            System.err.println(e);
        }


    }

     static double div(double a, double b) {
        if(a==0)
            throw new ArithmeticException("При делении нуля на любое число будет ноль");
        else if(b==0)
            throw new ArithmeticException("Деление на ноль");
        return a/b;
    }


    static int readNumber(int start,int end) {
        System.out.println("Введите число. Диапазон ["+start+"..."+end+"]");
        int n = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try  {
            n = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException en) {
            System.err.println(en + ": Не число");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (!(n >= start && n <= end))
            throw new IndexOutOfBoundsException("Число вне  диапазона");
        return n;
    }
}
