package com.codeup.java.animals;

public class TweetyBird extends Bird{
//extends means it's a subclass of the superclass it INHERITS all the methods of Birds since it is EXTENDING from the BIRD class

//Overriding a subclass redefines the

    public void makeNoise(){
        System.out.println("Tweet tweet");
    }
}
