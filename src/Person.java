package com.codeup.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Person {

    private String name;

    public Person(){} //default constructor holds no args inputting args such as name THEN allows for
//    Person person1 = new Person("John"); <--- these to be used within PersonTest
//    Person person2 = new Person("John");
/// DEFAULT CONTRACTORS will be overridden by custom constructor so make sure to supply the default

    public Person(String name){
       this.name = name;
    }

    public String getName(){
//TODO: return the person's name
       return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, %s!", name);
    }

    public String toString(){
        return name;
    }

    public static Person[] addPerson(Person[] array, Person newsib){
      int i;
      Person[] moreSiblings = new Person[array.length +1];
      for (i = 0; i < array.length; i++)
          moreSiblings[i] = array[i];///setting the new array to the new position of the old array

      moreSiblings[array.length] = newsib;
      return moreSiblings;


    }
    


}
