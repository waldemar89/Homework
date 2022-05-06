package com.lesson_5;

 /*1. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit; Необходимо реализовать класс Box,
 в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки,
 и апельсины; Для хранения фруктов внутри коробки можно использовать ArrayList;
 * Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта
 и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 * Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
 которую подадут в compare() в качестве параметра.
 true – если их массы равны, false в противоположном случае.
 Можно сравнивать коробки с яблоками и апельсинами;
 * Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
 Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты,
 которые были в первой;
 * Не забываем про метод добавления фрукта в коробку. */

public class Main {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();


        appleBox.addFruitToBox(apple1);
        appleBox.addFruitToBox(apple2);
        appleBox.addFruitToBox(apple3);
        appleBox.addFruitToBox(apple3);

        Box<Orange> orangeBox = new Box<>();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        orangeBox.addFruitToBox(orange1);
        orangeBox.addFruitToBox(orange2);
        orangeBox.addFruitToBox(orange3);

        //getWeight
        System.out.println("Apple box weights " + appleBox.getWeight());
        System.out.println("Orange box weights " + orangeBox.getWeight());

        // Compare
        System.out.println("The weights of two boxes is equal(true) or not(false) - " + appleBox.compare(orangeBox));

        // Moving apples to new Box with apples
        Box<Apple> newAppleBox = new Box<>();
        appleBox.moveFruits(newAppleBox);

        //Not forgetting about the method that adds new apple to new box with apples
        Apple apple5 = new Apple();
        newAppleBox.addFruitToBox(apple5);

        System.out.println("When we add some fruits the weight of the apple box is " + newAppleBox.getWeight());
    }

}
