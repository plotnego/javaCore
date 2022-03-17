package com.company;

 enum Type {Rose,Ficus,Kaktus}
 enum Color {Green,Yellow,Red}

public class Plant {



    private int size;
    private Type type;
    private Color color;

    public Plant(int size, String type, String color) throws ColorExeption,TypeExeption{
        this.size = size;
        this.type = typeEnum(type);
        this.color = colorEnum(color);
    }

    @Override
    public String toString() {
        return "Кол-во: "+size+". Цвет: "+color+". Тип: "+type;
    }
    private Color colorEnum(String color) throws ColorExeption{
        switch (color.toLowerCase()){
            case "green" : return Color.Green;
            case "yellow" : return Color.Yellow;
            case "red" : return  Color.Red;
            default: throw new ColorExeption("Доступны только: green,yellow,red.");
            }
        }
    private Type typeEnum(String type) throws TypeExeption{
        switch (type.toLowerCase()){
            case "rose" : return Type.Rose;
            case "ficus" : return Type.Ficus;
            case "kaktus" : return  Type.Kaktus;
            default: throw new TypeExeption("Доступны только: rose,ficus,kaktus.");
        }
    }
    }


