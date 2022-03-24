package com.company.task2.ex2;

public class Plane extends FlyingVehicle{

    private int maxDistance;

    public Plane() {
    }

    @Override
    protected void fly() {

    }

    @Override
    protected void land() {

    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
