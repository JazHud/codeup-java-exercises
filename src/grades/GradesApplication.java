package com.codeup.java.grades;

import com.codeup.java.movies.Movie;
import com.codeup.java.movies.MoviesArray;
import com.codeup.java.rpg.Monster;
import com.codeup.java.util.Input;

import com.codeup.java.util.Input;

import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> Students = new HashMap<>();

        Student Jaz = new Student("Jaz");
        Jaz.addGrade(55);
        Jaz.addGrade(70);
        Jaz.addGrade(80);
        Jaz.recordAttendance("2022-10-2","p");
        Jaz.recordAttendance("2022-10-3","p");
        Jaz.recordAttendance("2022-10-4","A");
        System.out.println(Jaz.getGrade());

        Student Jes = new Student("Jes");
        Jes.addGrade(55);
        Jes.addGrade(70);
        Jes.addGrade(80);
        Jes.recordAttendance("2022-10-2","p");
        Jes.recordAttendance("2022-10-3","p");
        Jes.recordAttendance("2022-10-4","p");

        Student Jay = new Student("Jay");
        Jay.addGrade(55);
        Jay.addGrade(70);
        Jay.addGrade(80);
        Jaz.recordAttendance("2022-10-2","p");
        Jaz.recordAttendance("2022-10-3","A");
        Jaz.recordAttendance("2022-10-4","p");

        Student Fran = new Student("Fran");
        Fran.addGrade(55);
        Fran.addGrade(70);
        Fran.addGrade(80);
        Fran.recordAttendance("2022-10-2","p");
        Fran.recordAttendance("2022-10-3","p");
        Fran.recordAttendance("2022-10-4","a");
        System.out.println("attendacePercentage below");


        Map<String, Student> usernameMap = Map.ofEntries(
                entry("fran1234", Fran),
                entry("jayhey", Jay),
                entry("jes123", Jes),
                entry("jazhud", Jaz)
                );
        Students.putAll(usernameMap);


//        System.out.println(Students);
//
//        System.out.println(Fran.getGrade());
//        System.out.println(Students.get("JazHud"));


        Scanner scanner = new Scanner(System.in);
        String goAgain = "y";
        while (goAgain.equalsIgnoreCase("y")) {
            System.out.printf("Welcome!%n Here are the GitHub usernames of our students:%n");
            for (Map.Entry<String, Student> usernameEntry : Students.entrySet()) {
//            Student student = usernameEntry.getValue();
                System.out.printf(" %s |", usernameEntry.getKey());
            }
            System.out.printf("%nWhat student would you like to see more information on?%n");
            String userInput;
            userInput = scanner.next();

//            apply the search method
            if (Students.containsKey(userInput)) {
                System.out.println("Name: " + Students.get(userInput) + " Username: " + userInput);

            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userInput);
            }
            System.out.println("Do you wnat to search for another student? (y/n) ");
            goAgain = scanner.next();
            scanner.nextLine();
            System.out.println("Goodbye, have a wonderful day!");
        }


    }
}
