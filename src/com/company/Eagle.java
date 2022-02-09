package com.company;

public class Eagle extends FlyingBird{
    public Eagle() {
        super(true, true);
    }
    public void info(){
        System.out.println("Вид : Орёл\nНаличие перьев : "+isFeathers()+"\nНесет ли яйца : "+isLayEggs()+"\nУмение летать : "+isFly());
    }

    @Override
    void fly() {
        System.out.println("Орёл улетел");
    }
}
