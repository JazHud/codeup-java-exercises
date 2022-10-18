package com.codeup.java.rpg;

//a class is a template for objects.
//Objects is an instance of the class.
public class Fighter { //<--fighter constructor aka blueprint fore object fields or default values
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    //getter
    public String getName(){
        return name;
    }
    private int hitPoints; //<-- instance variable belongs to that instance aka what it is like properties
    //setter
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    //getter// to return the private information
    public int getHitPoints(){
        return hitPoints;
    }
    private int maxDamage; //<-- instance variable
    public void printStats(){//<-- instance method aka what it does
        System.out.printf("%s has %d hit points and can do %d damage%n", name, hitPoints, maxDamage);
    }
    public void battleRoar(){//<-- instance method
        System.out.printf("I am %s and I will destroy you%n", name);
    }
    public int attackRoll(){ //<-- instance method called inside fighter class
        return D20.rollD20();// <-- calls a static method//class is always capitalized
    }
}
