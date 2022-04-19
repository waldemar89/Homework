package com.lesson_4.task_1to4;

public class Cat extends Animal {
    private static int count;
    public Cat ( int animalSwim, int animalRun, String petsName ){
        super(animalSwim,animalRun,petsName);
        count++;
    }

    public static int getCount(){
        return count;
    }
    }


