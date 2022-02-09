package com.company;

public class Penguin extends NonFlyingBird{
    public Penguin() {
        super(true, true);
    }
    public void info(){
        System.out.println("Вид : Пингвин\nНаличие перьев : "+isFeathers()+"\nНесет ли яйца : "+isLayEggs()+"\nУмение летать : "+isFly());
    }

    @Override
    void fly() {
        System.out.println("Пингвин летать не может");
    }
}
