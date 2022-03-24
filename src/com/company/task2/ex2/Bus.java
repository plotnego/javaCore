package com.company.task2.ex2;

public class Bus extends GroundVehicle{

    private String route;

    public Bus() {
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    protected void drive() {

    }
}
