package com.lesson_2;

import java.util.Arrays;

public class FillArray {
    public static void main(String[] args) {
        int[] array = new int[100];
        System.out.println(Arrays.toString(fillArray(array)));
    }
    public static int[] fillArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            Array[i] = i + 1;
        }
        return Array;
    }
}
