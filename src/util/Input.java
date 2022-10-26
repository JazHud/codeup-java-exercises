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
    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Yes or No?");
        String userInput = scanner.next().toLowerCase();
        boolean yay = userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
        return yay;
    }


        public int getInt (int min, int max){
            System.out.printf("Enter a number between %d and %d: ", min, max);
            int userInt = scanner.nextInt();
            if (userInt >= min && userInt <= max) {
                System.out.println("Your input is correct.");
                return userInt;
            } else {
                System.out.println("That's out of range, :(...try aging: ");
                return scanner.nextInt();
            }
        }

        public int getInt () {
            System.out.println("Enter a number: ");
            return scanner.nextInt();
        }

        //BELOW ALLOWS PROMPT TO BE INPUT FROM THE MAIN CLASS
        public double getDouble(String prompt){
            System.out.println(prompt);
            return scanner.nextDouble();
        }
        public double getDouble (double min, double max){
            System.out.printf("Enter a number with two decimal places between %.2f and %.2f: ", min, max);
            double userInt = scanner.nextDouble();
            if (userInt >= min && userInt <= max) {
                System.out.println("Your input is correct.");
                return userInt;
            } else {
                System.out.println("That's out of range, :(...try aging: ");
                return scanner.nextDouble();
            }
        }

        public double getDouble() {
            System.out.println("Enter a number with two decimal places: ");
            return scanner.nextDouble();
        }

    }

