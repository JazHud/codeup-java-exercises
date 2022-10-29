package com.codeup.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {

    public static void main(String[] args) {

        // ============================ PATH
        //PATH INTERFACE-represents a path in the file system
        //PATHS-get()<- method for creating a file path
        //Files Class-Object that represents a file
                    //-contains static methods for manipulating files; below are methods when using Path
            //write(Path, List<String>[, StandardOpenOption])
            //readAllines(Path), createFile(Path), delete(Path),
            //exists(Path), notExists(Path), createDirectories(Path), isDirectory(Path), size(Path)

        //String path = "src/test.txt.txt"; //<--not all operating systems don't use the same charters for their file path

//        Path pathToTest = Paths.get("src", "fileIoLecture", "test.txt.txt"); //<--creating a new path and naming file
//        System.out.println(pathToTest);
//
//        Path pathToWeywot = Paths.get("hello", "weywot.txt");
//        System.out.println(pathToWeywot);

//        Path fileLecturePath = Paths.get("src", "fileIoLecture", "FileIOLecture.java"); //<--this and above are all relative files
//        System.out.println(fileLecturePath);
//        System.out.println(fileLecturePath.toAbsolutePath()); //<-- to find the absolute path AKA staring from teh filesystem root

//        Path otherPath = Paths.get("src", "../", "src", "../", "src", "fileIoLecture", "FileIOLecture");
//        System.out.println(otherPath);
//        System.out.println(otherPath.normalize());
//        System.out.println(otherPath.toAbsolutePath());
//        System.out.println(otherPath.normalize().toAbsolutePath());

        // ============================ FILE METHOD

//        Path fileLecturePath = Paths.get("src", "fileIoLecture", "FileIOLecture.java");
//          System.out.println(Files.exists(fileLecturePath)); //<-returns false because the file does NOT exist
//            Path gitignoreFile = Paths.get(".gitignore"); //
//        System.out.println(Files.exists(gitignoreFile));//<- returns true because the file does exist
//        System.out.println(Files.exists(Paths.get("bob.txt")));
//
//        String directory = "data";                           //|| naming directory and file
//        String filename = "info.txt";                        //||
//        Path dataDirectory = Paths.get(directory);           //||
//        Path dataFile = Paths.get(directory, filename);      //||
//                                                             //||
//        System.out.println(dataDirectory);                   //||
//        System.out.println(dataFile);                        //||

//        if (Files.notExists(dataDirectory)) {                  //|| actually creating directory we named above
//            try {                                              //||
//                Files.createDirectories(dataDirectory);        //||
//            } catch (IOException e) {                          //||
//                throw new RuntimeException(e);                 //||
//            }                                                  //||
//        }
//
//        if (Files.notExists(dataFile)) {      //|| actually creating the file we named above
//            try {                             //||
//                Files.createFile(dataFile);   //||
//            } catch (IOException e) {         //||
//                e.printStackTrace();          //||
//            }
//        }


        // ============================ READING FILES

//         Path p = Paths.get("src", "test.txt");
//
//        List<String> lines = new ArrayList<>();
//
//        try {
//            lines = Files.readAllLines(p); //<-- if it does exist it will be but into lines of our newArrayList above sout'd below
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(lines);
//
//        for (String name : lines) {
//            System.out.println("Hello, " + name + "!");
//        }



//        try {
//            List<String> contents = Files.readAllLines(
//                Paths.get("data", "bob.txt")
//            );
//            for (String line : contents) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            System.out.println("Exception!");
//            e.printStackTrace();
//        }



        // ============================ WRITING FILES

        Path p = Paths.get("src",  "test.txt");

        List<String> newNames = Arrays.asList("John", "Fred", "Cathy");
        try {
            Files.write(p, newNames, StandardOpenOption.APPEND); //<--Files.write will erase all infor in test.txt file
            //StandardOpenOption.APPEND <-- has to be added to NOT clear previous data
        } catch (IOException e) {
            e.printStackTrace();
        }
//
//        List<String> names = new ArrayList<>();
//        names.add("Tim");
//        names.add("Sally");
//        names.add("Mary");
//
//        try {
//            Files.write(p, names, StandardOpenOption.APPEND);
//        } catch(IOException e) {
//            e.printStackTrace();
//        }


    }
}