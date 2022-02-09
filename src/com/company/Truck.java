package com.company;

public class Truck extends Car{

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }
    public String info(){
        return "Модель : "+getModel()+"\nМаксимальная скорость : "+getMaxSpeed()+"\nГод выпуска : "+getYearOfManufacture()+"\nТип : Truck";
    }
    public String run() {
        return getModel()+" RUN";
    }
    public String stop() {
        return getModel()+" STOP";
    }
}
