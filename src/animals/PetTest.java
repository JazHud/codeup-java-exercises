package com.codeup.java.animals;


public class PetTest {
    public static void main(String[] args) {
        Pets pet1 = new Pets();
        pet1.setName("Gizmo");
       pet1.setSpeak("Arff Arff");
        pet1.makeNoise();
//        String pet1Quote = pet1.Quote();

        Pets pet2 = new Pets();
        pet2.setName("animals.Bob");
        pet2.setSpeak("AroOOOoo AroOOOoo");
        pet2.makeNoise();
//        String pet2Quote = pet2.Quote();

        Pets pet3 = new Pets();
        pet3.setName("Harley");
        pet3.setSpeak("Rrrr-Arff Arff Arff");
//        String pet3Quote = pet3.Quote();
        pet3.makeNoise();
    }
}
