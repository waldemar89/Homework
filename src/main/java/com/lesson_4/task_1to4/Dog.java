package com.lesson_4.task_1to4;

public class Dog extends Animal {
    private static int count;
    private int animalSwim;
    public Dog ( int animalSwim, int animalRun, String petsName ){
        super(animalRun,petsName);
        this.animalSwim = animalSwim;
        count++;
    }

    @Override
    protected void swim(int distance) {
            if (animalSwim >= distance) {
                System.out.println(super.getPetsName() + "  ---- УСПЕШНО проплыл(а) " + distance + "м.");
            } else {
                System.out.println(super.getPetsName() + " ---- сошел(а) с дистанции");
            }
        }


    public static int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return ("_______________________________________________ \n" +
                "Кличка: '" + getPetsName() + "\' \n" +
                "Может проплыть " + animalSwim + "м. " +
                ", Может пробежать " + getAnimalRun() + "м. ");
    }
}
