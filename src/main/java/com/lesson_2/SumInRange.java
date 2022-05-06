package com.lesson_2;

import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value A");
        int a = in.nextInt();
        System.out.println("Enter value B");
        int b = in.nextInt();
        System.out.println("Result " + sumInRange(a, b));
    }

    public static boolean sumInRange(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }
}
