package com.codeup.java.animals;

public class BirdTest {

//    public static String argumentativeOrnithologist(String classification, String newClassification){
//        parrot.order = classification;
//        classification = newClassification;
//        return oldName + " is now" + newClassification;
//    }

    public static void main(String[] args) {
//        Bird crow = new Bird(); //<-- won't work since now we declared the bird class as abstract. Crow has to be created by extending the Bird class
//        crow.setName("Dr. Crow");
//        System.out.print(crow.getName() + " goes "); //<-- .print puts all code on the same line
//        crow.makeNoise();
//        TweetyBird goldfinch = new TweetyBird();
//        goldfinch.makeNoise();
//        Parrot parrot = new Parrot();
//        parrot.makeNoise();
////        parrot.echo("yee-haw");
//        Bird parrot2 = new Parrot(); //<-declared a data type of bird but made new object of Parrot aka POLYMORPHISM;
//        parrot2.makeNoise();
        //parrot2.echo("yee-haw"); //<-- only has the same methods of the bird but no unique methods of the parrot class also looses unique methods below.

//        System.out.println("New Array of bird makeNoise below");
//        Bird[] birds = new Bird[2];
//        birds[0] = new Parrot();
//        birds[0].setName("Polly");
//        birds[1] = new TweetyBird();
//        birds[1].setName("unknown");

//        for (Bird bird : birds) { //<--calling the array that was created above;
//            bird.makeNoise();
//        }
//
//        Parrot backToParrot = (Parrot)  birds[0]; //<- make sure you are using the correct index to target the correct object to get the echo method back
//        System.out.print(backToParrot.getName() + " says ");
//        backToParrot.echo("I an echo now");
//
//        Bird.birdSounds(birds); // using a method to call the created array;

        Parrot parrot = new Parrot();
        System.out.println(Parrot.order);
        //System.out.println(argumentativeOrnithologist("Psittaciformes", "Sphenisciformes"));
        parrot.beCute();

    }
}