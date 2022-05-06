package com.lesson_4.task_1to4;

public class Dog extends Animal {
    private static int count;
    public Dog ( int animalSwim, int animalRun, String petsName ){
        super(animalSwim,animalRun,petsName);
        count++;
    }
    public static int getCount(){
        return count;
    }

}
