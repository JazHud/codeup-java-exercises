package com.codeup.java;

public class PersonTest {
    public static void main(String[] args) {
        Person personMe = new Person();
        personMe.setName("Jazmine");
        personMe.sayHello();

        //WRONG!!! DONT DO THIS!!!
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        //WRONG!!! DONT DO THIS!!!
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        //WRONG!!! DONT DO THIS!!!
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}
