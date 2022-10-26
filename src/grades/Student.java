package com.codeup.java.grades;

import java.util.ArrayList;


import com.codeup.java.util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class Student {
    //It should have private properties for the student's name, and grades.
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;
    private ArrayList<String> absentDays;

    public HashMap<String, String> getAttendance() {
        return attendance;
    }

    public void setAttendance(HashMap<String, String> attendance) {
        this.attendance = attendance;
    }

    public String toString(){
        return name;
    }

    public String getString(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }

    public ArrayList<Integer> getGrade() {
        return grades;
    }
    public void setGrade(ArrayList<Integer> grade) {
        this.grades = grade;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    //The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.
    public Student(){}

    //Constructor that sets name property and initialized the grade property as an empty ArrayList
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        return (double) grades.stream().reduce(Integer::sum).get() / grades.size();
    }

    public void recordAttendance(String date, String value){
            if ((value.equalsIgnoreCase("A") || value.equalsIgnoreCase("P"))){
                attendance.put(date, value);
                if (value.equalsIgnoreCase("A")) {
                    absentDays.add(date);
                }
        } else {
                System.out.println("Please enter A for absent or P for present");
            }
    }

//    public double attendancePercentage(){
//
//    }






}


























