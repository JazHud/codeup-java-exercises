package com.codeup.java;

import java.util.Arrays;

import static com.codeup.java.Person.addPerson;

public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        ///To make the code above readable
        System.out.println(Arrays.toString(numbers));


        Person Gary = new Person();
        Gary.setName("Gary");
        Person Jonathan = new Person();
        Jonathan.setName("Jonathan");
        Person Nicole = new Person();
        Nicole.setName("Nicole");
        Person Jazmine = new Person();
        Jazmine.setName("Jazmine");

        Person[] siblings = {
                new Person("Gary"),
                new Person("Jonathan"),
                new Person("Nicole"),
        };
        for (Person sibling : siblings){
            System.out.println(sibling.getName()); //why does this work with/or without .getname()? ANSWER: method toString is getting the reference to the name/// .getname() is important for storing the actual variable.
        }


       siblings = addPerson( siblings, new Person ( "Jaz"));
        System.out.println(Arrays.toString(siblings));

    }
}
