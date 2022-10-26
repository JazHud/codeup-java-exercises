package com.codeup.java.grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student Jazmine = new Student("Jazmine");
        Jazmine.recordAttendance("2022-10-25", "P");
        Jazmine.addGrade(55);
        Jazmine.addGrade(70);
        Jazmine.addGrade(80);
        System.out.println(Jazmine.getName());
        System.out.println(Jazmine.getGrade());
        System.out.println(Jazmine.getGradeAverage());
        System.out.println(Jazmine.getGrade());
        System.out.println(Jazmine.getAttendance());
    }
}