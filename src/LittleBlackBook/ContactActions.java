package com.codeup.java.LittleBlackBook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ContactActions {

    //Adding contact to a file

    public static void addContact(String Contacts) {
//        String directory = "LittleBlackBook";
        String filename = "contactFile.txt";
//        Path contactsDirectory = Paths.get(directory);
        Path contactfilename = Paths.get(filename);

//        if(Files.notExists(contactsDirectory)){
//            try{
//                Files.createDirectories(contactsDirectory);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        if (Files.notExists(contactfilename)) {
            try{
                Files.createFile(contactfilename);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }


}
