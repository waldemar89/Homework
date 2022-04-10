package com.kurinnyi;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        //Задача - 6
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    //Задача - 2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }

    //Задача - 3
    public static void checkSumSign() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input value A:");
        int a = in.nextInt();
        System.out.println("Input value B:");
        int b = in.nextInt();
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Positive sum");
        } else {
            System.out.println("Negative sum");
        }
        System.out.println();
    }

    //Задача - 4
    public static void printColor() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input value A:");
        int value = in.nextInt();
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
        System.out.println();
    }

    //Задача - 5
    public static void compareNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input value A:");
        int a = in.nextInt();
        System.out.println("Input value A:");
        int b = in.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

