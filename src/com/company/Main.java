package com.company;

public class Main {

    public static void main(String[] args) {


        Car [] cars = {
            new Truck("DAF 505",140,2005),
            new Truck("DAF 1000",200,2015),
            new Sedan("Huyndai Elantra",254,2019),
            new Sedan("Volvo Eqilibris",487,2025)
    };

    for (Car car:cars){
        System.out.println(car.info());
    }
        System.out.println();
    Line [] lines = {
            new Line(new Point(1,2),new Point(3,4)),
            new Line(new Point(7,8),new Point(6,5)),
            new ColorLine(new Point(0,0),new Point(1,1),"Green"),
            new ColorLine(new Point(99,98),new Point(89,88),"Orange")
    };
    for(Line l:lines){
        l.print();
    }

    }
}
