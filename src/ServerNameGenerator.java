package com.codeup.java;

import java.util.Random;

public class ServerNameGenerator {


    public static String[] adjectives = {"adorable", "adventurous", "aggressive", "agreeable", "alert", "alive", "amused", "angry", "annoyed", "annoying"};

    public static String[] nouns = {"Actor", "Gold", "Painting", "Airport", "Guitar", "Piano", "Ambulance", "Hair", "Pillow", "Animal"};

    public String name;

    public static String randomizer(String[] array){
        int random = new Random().nextInt(array.length);
        return array[random];
    }
        public static void main(String[] args) {
//        System.out.println(randomizer(adjectives));
//        System.out.println(randomizer(nouns));
        System.out.printf("Here is your sever name:%n%s-%s", randomizer(adjectives),randomizer(nouns));

        //CleanerCode below
            String adjective = randomizer(adjectives);
            String noun = randomizer(nouns);
            String combined = adjective + "-" + noun;


        }
}

