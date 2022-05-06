package com.lesson_2;

import java.util.Arrays;

public class ValueInversion {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Array     " + Arrays.toString(array));
        System.out.println("New array " + Arrays.toString(inversion(array)));
    }
    public static int[] inversion(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }
}
