package com.company.task2.ex2;

public abstract class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle() {
    }
    protected abstract void fly();

    protected abstract void land();
}
