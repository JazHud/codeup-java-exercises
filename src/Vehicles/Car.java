package com.codeup.java.Vehicles;

public class Car extends Vehicle{
    public Car(){}
    public Car(String name){  //<-- because this was inherited from vehicle class already has a this.name that wast private therefore we call on the setter to use this method
        this.setName(name);
    }

}
