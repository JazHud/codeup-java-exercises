package com.codeup.java.shapes;

import com.codeup.java.util.Input;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble("Enter the radius of the circle: "));
        System.out.printf("The area of the circle is %.2f.%n", circle.getArea());
//        System.out.println("Please enter radius length: ");
//        Double radiusInput = Double.parseDouble(sc.next());

//        Circle circle1 = new Circle(radiusInput);
//        System.out.printf("The area of the circle is %.2f.%n", circle1.getArea());
        System.out.printf("The circumference of the circle is is %.3f.%n",circle.getCircumference());

//        Input inputForCircle = new Input();
//        System.out.println("Would you like to make another circle?");
//        System.out.println(inputForCircle.yesNo());

    }
}