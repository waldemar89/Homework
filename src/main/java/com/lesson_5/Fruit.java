package com.lesson_5;

public abstract class Fruit {
    private final float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float onePieceWeight() {
        return weight;
    }
}
