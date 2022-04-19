package com.lesson_4.task_1to4;

abstract class Animal {
    private int animalRun, animalSwim;
    private String petsName;

    Animal(int animalRun, int animalSwim, String petsName) {
        this.animalRun = animalRun;
        this.animalSwim = animalSwim;
        this.petsName = petsName;
    }

    protected void swim (int distance) {
        if (animalRun >= distance) {
            System.out.println( this.petsName + "  ---- УСПЕШНО проплыл(а) " + distance + "м.");
        } else {
            System.out.println( this.petsName + " ---- сошел(а) с дистанции");
        }
    }

    protected void run (int distance) {
        if (animalSwim >= distance) {
            System.out.println( this.petsName + " ---- УСПЕШНО пробежал(а) " + distance + "м.");
        } else {
            System.out.println( this.petsName + " ---- не выполнил норматив");
        }
    }
    public String toString() {
        return ("_______________________________________________ \n"+
                "Кличка: '" + petsName + "\' \n" +
                "Может проплыть " + animalSwim + "м. " +
                ", Может пробежать " + animalRun + "м. ");
    }

}
