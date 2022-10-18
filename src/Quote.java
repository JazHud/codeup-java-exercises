package com.codeup.java;

public class Quote {

    public static String RandomQuote() {
        long oneThroughFour = (int) Math.round(Math.random() * 4);
        if (oneThroughFour == 1) {
            return "I'm old";
        } else if (oneThroughFour == 2) {
            return "I'm on drugs!";
        } else if (oneThroughFour == 3) {
            return "I'm better than you.";
        } else if (oneThroughFour == 4) {
            return "I'm a lucky dog!";
        }
        return RandomQuote();
    }
}
////Look at Javiers for a better switch statment