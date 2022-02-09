package com.company;

public class FlyingBird extends Bird{
    @Override
    void fly() {

    }

    private boolean fly = true;

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }




}
