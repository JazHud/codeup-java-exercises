package com.codeup.java.animals;

import java.sql.SQLOutput;

abstract public class Bird {

//    private String name; // private is used more commonly for better protection than protected
    protected String name; // allows you to use name without the setName method including not needing getters and setters; The main purpose of protected keyword is to have the method or variable can be inherited from sub classes.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("caw caw");
    }

    //Polymorphic argument definition:
    public static void birdSounds(Bird[] birdsArray){
        for(Bird birds : birdsArray){
            birds.makeNoise();
        }
    }

    public Bird(){
        System.out.println("A bird just got constructed!");
    }
}
