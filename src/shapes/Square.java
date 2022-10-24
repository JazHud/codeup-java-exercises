package com.codeup.java.shapes;

public class Square extends Quadrilateral {
    @Override
    public double getPerimeter() {
        return 4 * length;
    }


    public Square(double side){
        super(side,side);
        this.length = side;
        this.width = side;

    }


    public void getLength(double length) {
        this.length = length;
        this.width = length;
    }


    public void getWidth(double width) {
        this.length = length;
        this.width = length;
    }
}
