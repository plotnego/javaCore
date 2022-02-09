package com.company;

public class Swallow extends FlyingBird{
    public Swallow() {
        super(true, true);
    }
    public void info(){
        System.out.println("Вид : Ласточка\nНаличие перьев : "+isFeathers()+"\nНесет ли яйца : "+isLayEggs()+"\nУмение летать : "+isFly());
    }
    @Override
    void fly() {
        System.out.println("Ласточка улетела");
    }
}
