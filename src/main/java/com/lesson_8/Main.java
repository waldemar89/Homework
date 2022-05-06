package com.lesson_8;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Задание 1.
        String[] names = {"Cat", "Sammy", "Bird", "Cat", "Lizard", "Bug", "Bug", "Dog", "Mouse", "Dog", "Rat", "Mouse"};
        Map<String, Integer> animal = new HashMap<>();

        for (String name : names) {
            Integer quantity = animal.get(name);
            if (quantity == null) {
                animal.put(name, 1);
            } else {
                animal.put(name, quantity + 1);
            }
        }
        System.out.println("\n" + animal + "\n_____________________________________________________________");


        //Задание 2. Phonebook

        PhoneBook newBook = new PhoneBook();
        newBook.add("Kurinnyi", "+12349876456");
        newBook.add("Tabachenko", "+86533578852");
        newBook.add("Gradilenko", "+85234569978");
        newBook.add("Kurinnyi", "+7932877765");
        newBook.add("Atamanovskyi", "+83546272894");

        // Search
        newBook.get("Kurinnyi");
        newBook.get("Gradilenko");
        newBook.get("Tabachenko");

    }
}
