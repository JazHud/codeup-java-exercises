package com.codeup.java.shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        Measurable myShape;

        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape = new Rectangle(4, 5);
        System.out.println(myShape.getPerimeter());//<--pull to troubleshoot
        System.out.println(myShape.getArea());

    }
}
