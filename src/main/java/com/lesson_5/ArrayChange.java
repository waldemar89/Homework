package com.lesson_5;
//Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
import java.util.Arrays;

public class ArrayChange<T> {
    public static void main(String[] args) {
        Integer[] intArr = {4, 5, 8, 11, 3};
        swapItems(intArr, 0, 4);
        String[] strArr = {"Hello", "World", "!"};
        swapItems(strArr, 0, 2);

    }

    public static <T> void swapItems(T[] arr, int i, int j) {
        if ((i < 0 || i >= arr.length) || (j < 0 || j >= arr.length)) {
            return;
        }

        System.out.println(Arrays.toString(arr));

        System.out.printf("%s and %s items swapped.\n", i, j);
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
    }

