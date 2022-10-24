package com.codeup.java;

import com.codeup.java.rpg.Monster;

import java.util.*;

public class ArrayListLecture {
    public static void main(String[] args) {
        ArrayList<Monster> monsterArrayList = new ArrayList<>(); //<how to declare to the reference variable (made to call back on later than monsterArrayList) to make a new empty ArrayList
        Monster orc = new Monster(12, 15, 9 ,"Orc");

        Monster ogre = new Monster(11, 59, 13, "Ogre");

        Monster blueDragon = new Monster(19, 225, 23, "Blue Dragon");

        Monster frostGiant = new Monster(15, 138, 25, "Frost Giant");

        Monster goblin = new Monster(15, 7, 5, "Goblin");

        Monster werewolf = new Monster(11, 58, 7, "Werewolf");
        monsterArrayList.add(orc);//<- to add monsters one at a time to the arrayList
//        System.out.println(monsterArrayList.size()); //<-- .size will give the length of the array like .length is used for arrays
       // System.out.println(monsterArrayList.get(0)); //<-- .get retrieves the element at the chosen index /// .toString is helping us not by not just getting the hashcode
//        System.out.println(monsterArrayList.get(0));
        monsterArrayList.add(ogre);
//        System.out.println(monsterArrayList.size());
        List<Monster> newMonsterList = new ArrayList<>(List.of(goblin, blueDragon, frostGiant, werewolf)); //<- how to add multiple objects to an ArrayList all at once in that exact order.
//        System.out.println(newMonsterList);
//        System.out.println(newMonsterList.get(1));
//        System.out.println(newMonsterList);
//        System.out.println(newMonsterList.get(1).getHitPoints());
        monsterArrayList.addAll(newMonsterList); //<- how to add multiple elements to an ArrayList all at once. Can also be done like below
//
//        HOw to add to an already made array list
//        monsterArrayList.addAll(new ArrayList<>(List.of(goblin, blueDragon, frostGiant, werewolf)));//<
//        System.out.println(monsterArrayList);
        newMonsterList = monsterArrayList; //<--replaced old array into the new one
//        System.out.println(newMonsterList);

        //to LOOP OVER ARRAYLISTS useful when you need to manipulate the array. gives access to the index
        //FOR LOOP
        for(int i = 0; i < monsterArrayList.size(); i++) {
             //System.out.println(monsterArrayList.get(i)); //<- each is displayed on one line
            if (i == monsterArrayList.size() - 1) {
                System.out.printf("%s%n", monsterArrayList.get(i));
            } else {
                System.out.printf("%s, ", monsterArrayList.get(i));
            } //<-- puts it all the monsters on one row
        }



        //ENHANCED FOR LOOP same as above but  with hit points(). doesn't have access to the index
        for(Monster monster : monsterArrayList){
            System.out.println(monster.getHitPoints());
        }

        //wright out the type of data type just int will not work! *Putting a primitive into an arrayList because arrayList can only contain objects.
        ArrayList<Integer> myNumbers = new ArrayList<>(List.of(1, 304, 32, 30, -84, 2, 7));
        System.out.println(myNumbers);

        Collections.sort(myNumbers); //collections is an util class in java containing useful static methods// *sorts by natual order*
        System.out.println(myNumbers);

        ArrayList<String> randomWords = new ArrayList<>(List.of("version", "suntan", "bond", "defeat", "later", "rate"));
        System.out.println(randomWords);

        Collections.sort(randomWords);
        System.out.println(randomWords);

        randomWords.sort(Collections.reverseOrder());
        System.out.println(randomWords);

        System.out.println(monsterArrayList);
        monsterArrayList.sort(Comparator.comparing(Monster::getHitPoints)); //<-double colon is a reference to the object//Comparator a set of instructions on how to compare// this is sorting hit points by lowest to highest
        System.out.println(monsterArrayList);
//        monsterArrayList.sort(Collections.reverseOrder()); //<- how to order from highest hit points to lowest /// Monster class needs a new methods to do so line 48
//        System.out.println(monsterArrayList);


        System.out.println(monsterArrayList);
        //to use the compare() method that we wrote in the Monster class, we use the sort method and pass it a no arg constructor
        monsterArrayList.sort(new Monster());

    }// end of main method
}// end of CollectionsLecture class
