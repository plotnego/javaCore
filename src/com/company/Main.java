package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int squareRectangle(int a, int b) throws ArithmeticException{
        if(a<=0 || b <= 0)
        throw new ArithmeticException("Введен ноль или отрицательное число");
        return a*b;
    }
    public static void main(String[] args) {

        System.out.println("Введите стороны прямоугольника");
        try(Scanner sc = new Scanner(System.in);)
        {
        int a = sc.nextInt();
        int b = sc.nextInt();
           int Area = squareRectangle(a,b);
            System.out.println("Площадь прямоугольника "+Area);
        }
        catch (InputMismatchException e) {
            System.err.println(e+": Введены неправильные значения");
        }
        catch (ArithmeticException e){
            System.err.println(e);
        }



        Plant [] plants = new Plant[5];
        try{
            plants[0]=new Plant(1,"rose","green");
            System.out.println(plants[0].toString());
        }
        catch (ColorExeption | TypeExeption e) {
            System.err.println(e);
        }
        try{
            plants[1]=new Plant(2,"ficus","yellow");
            System.out.println(plants[1].toString());
        }
        catch (ColorExeption | TypeExeption e) {
            System.err.println(e);
        }
        try{
            plants[2]=new Plant(3,"kaktus","red");
            System.out.println(plants[2].toString());
        }
        catch (ColorExeption | TypeExeption e) {
            System.err.println(e);
        }
        try{
            plants[3]=new Plant(4,"hrizantema","green");
            System.out.println(plants[3].toString());
        }
        catch (ColorExeption | TypeExeption e) {
            System.err.println(e);
        }
        try{
            plants[4]=new Plant(5,"rose","white");
            System.out.println(plants[4].toString());
        }
        catch (ColorExeption | TypeExeption e) {
            System.err.println(e);
        }
    }
}
