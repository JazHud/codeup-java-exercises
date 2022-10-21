package com.codeup.java.shapes;

public class Rectangle {

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int width;

    public int getWidth(int i) {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(){};

    public Rectangle(int length, int width){
        this.setLength(length);
        this.setWidth(width);
    }

    public int getArea(int length, int width){
        System.out.println("Im the superclass");
        return length * width;
    }

    public int getPerimeter(int length, int width){
        System.out.println("Im the superclass");
        return ((2 * length) + (2 * width));
    }


}
