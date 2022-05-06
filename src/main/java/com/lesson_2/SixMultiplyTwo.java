package com.lesson_2;

import java.util.Arrays;

public class SixMultiplyTwo {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Array     " + Arrays.toString(array));
        System.out.println("New array " + Arrays.toString(newArray(array)));
    }
    public static int[] newArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }
}

