package com.lesson_2;

import java.util.Scanner;

public class ValueTrueFalse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value");
        int value = in.nextInt();
        System.out.println("Result " + valueTrueFalse(value));
    }

    public static boolean valueTrueFalse(int value) {
        if (value >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
