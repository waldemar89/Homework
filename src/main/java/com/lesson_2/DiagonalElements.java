package com.lesson_2;

import java.util.Arrays;

public class DiagonalElements {
    public static void main(String[] args) {
        int[][] array = {{7, 11, 21}, {9, 61, 51}, {1, 15, 17}};
        diagonalElements(array);

    }
    public static void diagonalElements(int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

    }
}

