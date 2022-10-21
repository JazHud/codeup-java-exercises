package com.codeup.java.Vehicles;

public class Motorcycle extends Vehicle {

    public void makeNoise() {
        System.out.println("Vrm Vrm");
    }

    public void breakDowns(){
        super.makeNoise();
        System.out.println("KR-CLUNK");
    }

    public Motorcycle(){}

    public Motorcycle(String name){
        this.setName(name);
    }
}
