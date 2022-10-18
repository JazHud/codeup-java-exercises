package com.codeup.java.animals;

public class Dog { // <--excess modifier/visibility modifier (can be accessed anywhere inside)
    public static String bark(){ //<-calling a method // all methods must be defined by type( int, boolean, long etc. /// voids and can't return therefor store information
       // System.out.println("Woof woof!");//
        return "Woof woof";
    }
    public static void bark(int weight){ //<--Method Overloading (same as the one above just a different versions) but with dif parameter type/ order/ or number off.
        if (weight < 25){
            System.out.println("Yip yip");
        } else {
            System.out.println("Woof woof");
        }
    }

    public static void bark(int weight, String name) {
        System.out.printf("%s goes ", name);
        bark(weight);
    }

//        String output = name + " goes ";
//        if(weight < 25){
//            output += "yip yip";
//        } else {
//            output += "woof woof";
//        }
//        System.out.println(output);
//    }

    public static void main(String[] args) {
//        bark();                         // three diff ways to call methods for void

        String bark = bark();           // |
        System.out.println(bark);       // |same as above
//
//        System.out.println(bark());     // |same as above
//
//        bark(15);
//        bark(50);
//        bark(50, "animals.Bob");
//        bark(15, "Gizmo");
    }
}
