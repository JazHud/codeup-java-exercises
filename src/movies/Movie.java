package com.codeup.java.movies;

public class Movie {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String name(String prompt){
//        System.out.println(prompt);
//        return scanner.next();
//    }
    private String category;

    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public Movie(){};

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }





}
