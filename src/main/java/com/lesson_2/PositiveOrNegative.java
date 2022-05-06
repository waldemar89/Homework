package com.lesson_2;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value");
        int value = in.nextInt();
        sumInRange(value);
    }

    public static void sumInRange(int value) {
        if (value < 0) {
            System.out.println("Value negative.");
        } else {
            System.out.println("Value positive.");
        }

    }
}
