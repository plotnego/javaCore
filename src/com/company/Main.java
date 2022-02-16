package com.company;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
    Car car = Car.getCar()
            .addModel("Suzuki")
            .addColor("green")
            .addData(LocalDate.of(1998,01,11))
            .addEngineCapacity(284.56)
            .addPassengerCapacity(5)
            .addIsAirConditioning(true)
            .build();

        System.out.println(car.toString());

        WrapperShape <Shape> WS = new WrapperShape<>(new Square());
        WrapperShape <Shape> WS2 = new WrapperShape<>(new Circle());

    }
}
