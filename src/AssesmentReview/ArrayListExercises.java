package com.codeup.java.AssesmentReview;

import java.util.ArrayList;

public class ArrayListExercises {

    public static void main(String[] args) {


        ArrayList<String> colors = new ArrayList<>();

        String[] colorArray = {"pink", "red", "blue", "orange", "yellow"};
        for (String colorsArray : colorArray) {
            colors.add(colorsArray); //<--adding array of strings into an array list declared above online 10
            System.out.println(colorsArray);
        }
        System.out.println(colors); //<--

    }
}
