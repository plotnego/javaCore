package com.company;

public class Chicken extends NonFlyingBird{
    public Chicken() {
        super(true, true);
    }
    public void info(){
        System.out.println("Вид : Курица\nНаличие перьев : "+isFeathers()+"\nНесет ли яйца : "+isLayEggs()+"\nУмение летать : "+isFly());
    }
    @Override
    void fly() {
        System.out.println("Курица летать не может");
    }
}

