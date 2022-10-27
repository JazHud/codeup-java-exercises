package com.codeup.java.util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
        System.out.println("");
    }

    public String getString() {
        System.out.println("Enter your text here: ");
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Yes or No?");
        String userInput = scanner.next().toLowerCase();
        boolean yay = userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
        if (yay) {
            return true;
        } else {
            return false;
        }
    }


//        public int getInt (int min, int max){
//            System.out.printf("Enter a number between %d and %d: ", min, max);
//            int userInt = scanner.nextInt();
//            if (userInt >= min && userInt <= max) {
//                System.out.println("Your input is correct.");
//                return userInt;
//            } else {
//                System.out.println("That's out of range, :(...try aging: ");
//                return scanner.nextInt();
//            }
//        }

    public int getInt(int min, int max) {
        String prompt = "Enter an integer between " + min + " and " + max + ":";
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        while (userInput < min || userInput > max) {
            System.out.println(prompt);
            userInput = scanner.nextInt();
        }
        return userInput;
    }


    public int getInt() {
        //get user input as a string, parse the string into a number, and if the parse input throws an exception, recurse
        //if no exception return teh parsed number
        String userInput = getString();
        try {
            return Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input type. Enter a number!");
            return getInt(); //<--recursion
        }
    }


//        public int getInt () {
//            System.out.println("Enter a number: ");
//            return scanner.nextInt();
//        }

    //BELOW ALLOWS PROMPT TO BE INPUT FROM THE MAIN CLASS
//        public double getDouble(String prompt){
//            System.out.println(prompt);
//            return scanner.nextDouble();
//        }
//        public double getDouble (double min, double max){
//            System.out.printf("Enter a number with two decimal places between %.2f and %.2f: ", min, max);
//            double userInt = scanner.nextDouble();
//            if (userInt >= min && userInt <= max) {
//                System.out.println("Your input is correct.");
//                return userInt;
//            } else {
//                System.out.println("That's out of range, :(...try aging: ");
//                return scanner.nextDouble();
//            }
//        }
//
//        public double getDouble() {
//            System.out.println("Enter a number with two decimal places: ");
//            return scanner.nextDouble();
//        }

    public double getDouble() {
        //get user input as a string, parse the string into a number, and if the parse input throws an exception, recurse
        //if no exception return teh parsed number
        String userInput = getString();
        try {
            return Double.parseDouble(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input type. Enter a number!");
            return getDouble(); //<--recursion
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        String prompt = "Enter an number between " + min + " and " + max + ":";
        System.out.println(prompt);
        double userInput = getDouble();
        while (userInput < min || userInput > max) {
            System.out.println(prompt);
            userInput = scanner.nextDouble();
        }
        return userInput;
    }


    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getInt());
        System.out.println(input.getDouble());
    }
}

