package com.codeup.java;

import com.codeup.java.animals.Parrot;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIoPractice {

//    private static void deleteName(String nameToDelete) {
//        List<String> updatedNames = new ArrayList<>();
//        for(String name : readLines()){
//            if (!name.equalsIgnoreCase((nameToDelete))) {
//                updatedNames.add(name);
//            }
//        }
//        writeLines(updatedNames);
//    }


    public static void main(String[] args) {

        //method for greetNames
        Path textFile = Paths.get("fileIo", "text.txt");
        List<String> textFileOutput = new ArrayList<>();

        try {
            textFileOutput = Files.readAllLines(textFile);
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(textFileOutput); //<-outputting the created ArrayList

        for(String name : textFileOutput) {
            System.out.println(name + " works at Codeup."); //<-looping through ArrayList
        }

        List<String> pplToAdd = Arrays.asList("Jazmine", "John", "Rich", "Frances");

        try{
            Files.write(textFile, pplToAdd);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
