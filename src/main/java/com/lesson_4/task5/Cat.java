package com.lesson_4.task5;

public class Cat {

        public String name;
        public int appetite;
        public boolean fullness;

        public Cat(String name, int appetite, boolean fullness) {
            this.name = name;
            this.appetite = appetite;
            this.fullness = fullness;
        }

        public void eat(Plate plate) {
            plate.decreaseFood(appetite);
        }

}
