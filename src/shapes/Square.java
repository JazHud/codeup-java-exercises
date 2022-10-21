package com.codeup.java.shapes;

public class Square extends Rectangle {

    public Square(){}

    public Square(int side){
        this.setWidth(side);
        this.setLength(side);
    }

    public int getPerimeter(int side){
        System.out.println("Im the subclass of Rectangle");
        return side * 4;
        //these methods get overridden by the superclass
    }

    public double getArea(double side){
        System.out.println("Im the subclass of Rectangle");
        return Math.pow(side, 2);
    }


}
