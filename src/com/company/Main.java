package com.company;

public class Main {

    public static class massagesThread extends Thread{
        public String m;
        public int interval;
        public int num;
        public massagesThread(String m,int interval,int num ){
            this.m=m;
            this.interval=interval;
            this.num=num;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getM() {
            return m;
        }

        public int getInterval() {
            return interval;
        }

        @Override
        public void run() {

                try {
                    for (int i = 0; i < getNum(); i++) {
                        sleep(getInterval());
                        System.out.println(getM());
                    }
                    } catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
        }

    public static void main(String[] args) throws InterruptedException {
        Thread sleep = new massagesThread("I study Java",1000,10);
        sleep.start();
        sleep.join();

        Thread m = new massagesThread("Hello, world",2000,5);
        Thread m2 = new massagesThread("Peace in the peace",3000,5);
        m.start();
        m2.start();

        m.join();
        m2.join();

        System.out.println("My name is …");
    }
}
