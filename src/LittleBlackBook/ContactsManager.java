package com.codeup.java.LittleBlackBook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactsManager {

    public static void addFileMethod(String Contacts) {
        String filename = "contactFile.txt";
        Path contactFileName = Paths.get(filename);
        if (Files.notExists(contactFileName)) {
            try{
                Files.createFile(contactFileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public searchContacts(String prompt){
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextLine();
        return userInput;
    }

    public static void main(String[] args) {
        Contacts person1 = new Contacts("jaz", "0320");
        System.out.println(person1);
        ArrayList<Contacts> ContactList = new ArrayList<>();
        System.out.println(ContactList);
        Contacts person2 = new Contacts("Exiber", "3090");
        System.out.println(ContactList.add(person1));
        System.out.println(ContactList.add(person2));
        System.out.println(ContactList);
        System.out.println(ContactList.get(0));
        System.out.println(ContactList.
    }
    }
