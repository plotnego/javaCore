package com.company;

import java.time.LocalDate;

public class Car {
    private String model;
    private LocalDate dataOfProduction;
    private double engineCapacity;
    private String color;
    private int passengerCapacity;
    private boolean isAirConditioning;

    private Car() {}

    public static CarBuilder getCar(){
        return new Car().new CarBuilder();
    }



    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", dataOfProduction=" + dataOfProduction +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", isAirConditioning=" + isAirConditioning +
                '}';
    }

    public class CarBuilder {
       public CarBuilder(){
            new Car();
        }
        public CarBuilder addModel(String model){
            Car.this.model=model;
            return this;
        }

        public CarBuilder addColor(String color){
            Car.this.color=color;
            return this;
        }

        public CarBuilder addData(LocalDate localDate){
            Car.this.dataOfProduction=localDate;
            return this;
        }
        public CarBuilder addEngineCapacity(Double engineCapacity){
            Car.this.engineCapacity=engineCapacity;
            return this;
        }
        public CarBuilder addPassengerCapacity(int passengerCapacity){
            Car.this.passengerCapacity=passengerCapacity;
            return this;
        }
        public CarBuilder addIsAirConditioning(boolean isAirConditioning){
            Car.this.isAirConditioning=isAirConditioning;
            return this;
        }


        public Car build() {
            return Car.this;
        }
    }
}
