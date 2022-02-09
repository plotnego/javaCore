package com.company;

public class ColorLine extends Line{
    private String color;

    public ColorLine(Point p1,Point p2,String color) {
        super(p1,p2);

        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "\nColor line\n Point 1\n"+getP1()+"\n Point 2\n"+getP2()+"\n Color : "+getColor();

    }
    public void print(){
        System.out.println(toString());
    }
}
