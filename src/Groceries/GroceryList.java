package com.codeup.java.Groceries;

import com.codeup.java.movies.Movie;
import com.codeup.java.movies.MoviesArray;
import com.codeup.java.util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
    Grocery Milk = new Grocery("milk", "dairy", "4");
        System.out.println(Milk);

        ArrayList<String> groceryArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        do{
            System.out.println("Would you like to make a grocery list? (y/n)");
            choice = scanner.next();
            System.out.println();

        }while(choice.equalsIgnoreCase("y"));
        scanner.close();

    }
}
