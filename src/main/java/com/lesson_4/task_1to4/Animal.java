package com.lesson_4.task_1to4;

abstract class Animal {
    private int animalRun;
    private String petsName;

    public String getPetsName() {
        return petsName;
    }

    public int getAnimalRun() {
        return animalRun;
    }

    Animal(int animalRun, String petsName) {
        this.animalRun = animalRun;
        this.petsName = petsName;
    }

    protected abstract void swim(int distance);

    protected void run(int distance) {
        if (animalRun >= distance) {
            System.out.println(this.petsName + " ---- УСПЕШНО пробежал(а) " + distance + "м.");
        } else {
            System.out.println(this.petsName + " ---- не выполнил норматив");
        }
    }


}

