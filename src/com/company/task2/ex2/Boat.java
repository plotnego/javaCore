package com.company.task2.ex2;

public class Boat extends WaterVehicle{
    private int volume;

    public Boat() {
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    protected void isSailing() {

    }
}
