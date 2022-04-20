package com.lesson_4.task_1to4;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Cat(3, 150, "Knopa (кот)");
        animals[1] = new Cat(5, 200, "Murzik (кот)");
        animals[2] = new Dog(8, 500, "Beast (пёс)");
        animals[3] = new Dog(10, 450, "Max (пёс)");
        animals[4] = new Cat(0, 100, "Archi (кот)");
        animals[5] = new Dog(5, 300, "Dina (пёс)");

        System.out.println("Всего котов: " + (Cat.getCount()));
        System.out.println("Всего собак: " + (Dog.getCount()));
        for (Animal pets : animals)
            System.out.println(pets);
        System.out.println("***********************************************" );
        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(3);
        }
        System.out.println("***********************************************" );
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(200);
        }
    }
}



