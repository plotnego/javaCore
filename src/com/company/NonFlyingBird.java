package com.company;

public class NonFlyingBird extends Bird{
    @Override
    void fly() {

    }

    private boolean fly = false;

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

}
