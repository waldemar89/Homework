package com.lesson_4.task_1to4;

public class Cat extends Animal {
    private static int count;

    public Cat(int animalRun, String petsName) {
        super(animalRun, petsName);

        count++;
    }

    @Override
    protected void swim(int distance) {
        System.out.println(getPetsName() + " ---- Кот не умеет плавать");
    }

    @Override
    public String toString() {
        return ("_______________________________________________ \n" +
                "Кличка: '" + getPetsName() + "\' \n" +

                "Может пробежать " + getAnimalRun() + "м. " + "Плавать не умеет");
    }

    public static int getCount() {
        return count;
    }
}


