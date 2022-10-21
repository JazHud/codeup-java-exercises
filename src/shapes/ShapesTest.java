package com.codeup.java.shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle();
        box1.setWidth(4);
        box1.setLength(5);
        System.out.println(box1.getPerimeter(5, 4));
        System.out.println(box1.getArea(5, 4));
        Rectangle box2 = new Square();
        box2.getWidth(5);
        box2.setLength(5);
        System.out.println(box2.getArea(5, 5));
        System.out.println(box2.getPerimeter(5, 5));
    }
}
