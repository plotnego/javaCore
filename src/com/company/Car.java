package com.company;

public class Car {
    public enum Type{
        SEDAN("Седан"),
        UNIVERSAL("Универсал"),
        HATCHBACK("Хэтчбек"),
        MINIVAN("Минивен"),
        CROSSOVER("Кроссовер"),
        COUPE("Купе"),
        CABRIOLET("Кабриолет"),
        PICKUP("Пикап");

        private String name;

        public String getName() {
            return name;
        }

        Type(String name) {
            this.name = name;
        }
    }

    private String type;
    private int year;
    private int engineCapacity;

    public Car(Type type, int year, int engineCapacity) {
        this.type = type.getName();
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public static Car[] orderByTheYear(Car [] cars){
        Car[] tempArr = new Car[cars.length];
        for (int z=0;z< cars.length;z++){
            tempArr[z]=cars[z];
        }
        Car temp;
        for(int i =0; i<tempArr.length-1;i++)
            for(int j=i+1;j<tempArr.length;j++){
                if (tempArr[i].getYear() > tempArr[j].getYear()) {
                    temp = tempArr[i];
                    tempArr[i]=tempArr[j];
                    tempArr[j]=temp;
                }
        }
        return tempArr;
    }

    public static void info(Car [] cars){
        for (Car ca : cars){
            System.out.println("Тип : "+ca.getType()+"\nГод выпуска : "+ca.getYear()+"\nОбьем двигателя : "+ca.getEngineCapacity());
        }
    }
}

