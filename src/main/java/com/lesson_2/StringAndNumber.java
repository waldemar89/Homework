package com.lesson_2;

import java.util.Scanner;

public class StringAndNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String string = in.nextLine();
        System.out.println("Enter value");
        int value = in.nextInt();
        stringAndValue(value, string);
    }

    public static void stringAndValue(int value, String string) {
        for (int i = 1; i <= value; i++) {
            System.out.println("[" + i + "]" + " " + string);
        }
    }
}
