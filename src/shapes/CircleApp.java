package com.codeup.java.shapes;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius length: ");
        Double radiusInput = Double.parseDouble(sc.next());

        Circle circle1 = new Circle(radiusInput);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
    }
}