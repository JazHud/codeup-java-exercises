package com.codeup.java.shapes;


public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        super(); ///<-- see how this compairs to javiers
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }


    public Quadrilateral(){
    };

    public void Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

//
//    public double getPerimeter(double length, double width) {
//        return ((2 * length) + (2 * width));
//    }
//
//    public double getArea(double length, double width){
//        return (length * width);
//    }
//
//    public abstract void setWidth();
}
