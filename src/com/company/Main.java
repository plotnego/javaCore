package com.company;

public class Main {

    static class thread extends Thread{
        String m;
        public thread(String m){
            this.m=m;
        };
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(m);
            }
        }
    }

    public static class hwThread1 implements Runnable  {
        @Override
        public void run() {
            Runnable r2 = new hwThread2();
            Thread t2 = new Thread(r2);
            t2.start();
        }
    }

    public static class hwThread2 implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
            Runnable r3 = new hwThread3();
            Thread t3 = new Thread(r3);
            t3.start();
        }
    }

    public static class hwThread3 implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
//first
        Thread t1 = new thread("First"),
                t2 = new thread("Second"),
                t3 = new thread("Third");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();

//Second task on DeadLock package

//third
//  Вопрос : Правильно ли то что я написал ниже. И если правильно то какие могут быть нюансы. И какой вариант лучше\оптимальней?
//      Первый поток имплементирует интерфейс Runnable.
//      Второй и третий может как имплементировать интерфейс Runnable ,
//      так и быть расширенным классом Thread (соответственно создавать Thread без создания Runnable)
//      или наследовать предидуший поток (public class hwThread2 extend hwThread1 и public class hwThread3 extend (hwThread2 или hwThread1)).

        Runnable r1 = new hwThread1();
        Thread T1 = new Thread(r1);
        T1.start();
    }


}
