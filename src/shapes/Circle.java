package com.codeup.java.shapes;

import java.util.Scanner;

public class Circle {

    private double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getString(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }

//    public String newCircles(){
//        Input inputForCir = new Input();
//        System.out.println("Would you like to continue?");
//        String userInput = scanner.next();
    }

