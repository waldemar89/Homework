package com.lesson_4.task5;

import java.util.Scanner;
//Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
// Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
// Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
//Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
//Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
public class Main {

        public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int action;
            Cat[] allCats = new Cat[4];
            allCats[0] = new Cat("Barsik", 5, false);
            allCats[1] = new Cat("Knopa", 30, false);
            allCats[2] = new Cat("Murzik", 10, false);
            allCats[3] = new Cat("Archi", 45, false);
            System.out.println("How much food do you want to give the cats?");
            action = sc.nextInt();
            Plate plate = new Plate(action);
            plate.info();
            for (int i = 0; i < allCats.length; i++) {
                if (allCats[i].fullness == false && allCats[i].appetite <= plate.food){
                    allCats[i].eat(plate);
                    allCats[i].fullness = true;
                    System.out.println("Cat " + allCats[i].name + "  eaten!");
                } else {
                    System.out.println("Cat " + allCats[i].name + " did not eat!");
                }
            }
            plate.info();
            System.out.println("How much food to add to the bowl?");
            action = sc.nextInt();
            plate.increaseFood(action);
            plate.info();

        }
    }

