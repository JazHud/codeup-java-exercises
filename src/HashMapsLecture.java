package com.codeup.java;

import com.codeup.java.rpg.Monster;

import javax.management.monitor.MonitorSettingException;
import java.util.*;

import static java.util.Map.entry;

public class HashMapsLecture { //<-- data structure where value is stored in a bucket known as a key and is typically stored as a string. EVERY KEY MUST BE UNIQUE to insure its retrieving the right value.///Highly efficient data structure more so than arrays

    //* a key value pair is called an entry

    //All maps use the map interface
    public static void main(String[] args) {
        Monster orc = new Monster(12, 15, 9, "Orc");

        Monster ogre = new Monster(11, 59, 13, "Ogre");

        Monster blueDragon = new Monster(19, 225, 23, "Blue Dragon");

        Monster frostGiant = new Monster(15, 138, 25, "Frost Giant");

        Monster goblin = new Monster(15, 7, 5, "Goblin");

        Monster werewolf = new Monster(11, 58, 7, "Werewolf");

        Monster orcWarChief = new Monster(16, 93, 15, "Orc War Chief");

        //how to create a new HashMap definition the key value data types between angle brackets
        HashMap<String, Monster> monsterHashMap = new HashMap<>();

        // Add a key-value pair to the hashmap using .put()
        monsterHashMap.put("orc", orc); //key = "orc, value = orc

        //to access a value in teh hashmap using .get() with the key
        System.out.println(monsterHashMap.get("orc"));
        System.out.println(monsterHashMap.get("orc").getHitPoints());

        //Replacing a value in the hashmap using .replace()
        monsterHashMap.replace("orc", orcWarChief);
        System.out.println(monsterHashMap.get("orc"));
        System.out.println(monsterHashMap.get("orc").getHitPoints());

        // To add multiple objects at once use Map.ofEntries
        Map<String, Monster> intermediateMap = Map.ofEntries(
                entry("blue dragon", blueDragon),
                entry("ogre", ogre),
                entry("werewolf", werewolf),
                entry("frost giant", frostGiant),
                entry("goblin", goblin),
                entry("orc war chief", orcWarChief)
        );

        monsterHashMap.putAll(intermediateMap);

        System.out.println(monsterHashMap.get("frost giant"));

        System.out.println(monsterHashMap.get("frost giant").getHitPoints());

        //Map.Entry is the information we get from looping through a HashMap but not really in this case more so like looping through entrySets
        System.out.println("Loop over entryset below");
        for(Map.Entry<String, Monster> monsterEntry : monsterHashMap.entrySet()){
            Monster monster = monsterEntry.getValue();
            System.out.printf("The %s has %d hit points, an amor class of %d and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        }

        //To create a list of specific properties in teh objects stored as HashMap values, we can use .keySet().stream().toList() aka to change entrySet to an array list
        
        List<String> monsterNames = new ArrayList<>(monsterHashMap.keySet().stream().toList());
        //Now can use methods we can use on ArrayLists
        Collections.sort(monsterNames);
        System.out.println(monsterNames); // now key values are returned in an array

        //String generated from the keyset are the keys to teh HashMap so looping over this list holds access to all teh HashMap entries v ENHANCED LOOP BELOW v
        System.out.println("Loop over keyset converted to list below");
        for(String monsterName : monsterNames){
            Monster monster = monsterHashMap.get(monsterName);
            System.out.printf("The %s has %d hit points, an amor class of %d and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        }

        // technique 3: the forEach Loop
        System.out.println("forEach Loop below");
        monsterHashMap.forEach((key, monster) -> {
            System.out.printf("The %s has %d hit points, an amor class of %d and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        });

        //converting a HASH-MAP INTO A TREE-MAP to sort by key
        System.out.println("Output of the forEach over the TreeMap");
        Map<String, Monster> monsterTreeMap = new TreeMap<>(monsterHashMap);
        monsterTreeMap.forEach((key, monster) -> {
            System.out.printf("The %s has %d hit points, an amor class of %d and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        });

        // using the Collection toArray() method to convert a collection of HashMap values into an array of objects:::Each value in a HashMap is an object using .values().toArray() we can create an array of objects
        Object[] monstersArray = monsterHashMap.values().toArray(); //using polymorphism to make an array of our monsterHasMap
        for(Object monster : monstersArray){
            int hitPoints = ((Monster) monster).getHitPoints();
            System.out.println(hitPoints);
        }

        Monster[] monstersArray2 = monsterHashMap.values().toArray(new Monster[0]);
        for(Monster monster : monstersArray2){
            System.out.println(monster.getName() + " has " + monster.getHitPoints() + " hit points");
        }


    }//end of main method
}//end of class
