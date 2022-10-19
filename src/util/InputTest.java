package com.codeup.java.util;

public class InputTest {
    public static void main(String[] args) {
        Input input1 = new Input();
        System.out.println(input1.getString());
        System.out.println(input1.yesNo());
        System.out.println(input1.getInt(1, 100));
        System.out.println(input1.getInt());
        System.out.println(input1.getDouble(1.00, 100.00));
        System.out.println(input1.getDouble());
        System.out.println(input1.getDouble("Enter your grade: "));

    }
}
