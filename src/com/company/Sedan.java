package com.company;

public class Sedan extends Car{


    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }
    public String info(){
        return "Модель : "+getModel()+"\nМаксимальная скорость : "+getMaxSpeed()+"\nГод выпуска : "+getYearOfManufacture()+"\nТип : Sedan";
    }
    public String run() {
        return getModel()+" RUN";
    }
    public String stop() {
        return getModel()+" STOP";
    }
}
