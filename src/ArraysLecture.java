package com.codeup.java;

import java.util.Arrays;

//Java arrays have to all be of the same time AND has a definite amount
// type goes before [] and then name afterwards alike line 6
public class ArraysLecture {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5]; //initializing the array w/ below being elements of the array;
        numbers[0] = 78;
        numbers[1] = 253;
        numbers[2] = -23;
        numbers[3] = -789;
        numbers[4] = 36;
        System.out.println(numbers[0]);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // will mutate the original array. and sout will return the []'s
//        System.out.println(numbers[0]);

        String[] wordsForWeird = {"strange", "bizarre", "uncanny", "odd", "peculiar", "weird"};
//        System.out.println(wordsForWeird[2]); // result uncanny

        for (String wordForWeird : wordsForWeird){ ///wordsForWeird <-new declared name! // ENHANCED FOR like forEach
            System.out.println(wordForWeird);       // <-declared name again
        }

        for (int number : numbers) {
            System.out.println(number);
            }

        for (int i = 0; i < numbers.length; i++){
            System.out.printf("The number at index %d si %d%n", i, numbers[i]);

            }
        }

    }

