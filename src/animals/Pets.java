package com.codeup.java.animals;
import com.codeup.java.Quote;

public class Pets {
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    private String speak;
    public void makeNoise(){
        System.out.printf("%s goes %s!%n", name, Quote.RandomQuote());
    }
//    public String Quote(){
//        return Quote.RandomQuote();
//    }
}

