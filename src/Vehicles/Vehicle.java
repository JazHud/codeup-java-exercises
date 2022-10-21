package com.codeup.java.Vehicles;

public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("honk honk");
    }

    public void alarm(){
        System.out.println("WEE-WOO");
    }
    public Vehicle(){};

    public Vehicle(String name){
        this.name = name;
    }

}


