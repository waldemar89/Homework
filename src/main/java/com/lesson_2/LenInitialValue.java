package com.lesson_2;

import java.util.Arrays;
import java.util.Scanner;


public class LenInitialValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value - len:");
        int len = in.nextInt();
        System.out.println("Enter value - initialValue:");
        int initialValue = in.nextInt();
        System.out.println("Array " + Arrays.toString(newArray(len,initialValue)));
    }
    public static int[] newArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
