package com.lesson_7;

import java.util.Arrays;
//Средства ввода-вывода
//Домашнее задание
// Домашнее задание

// Для выполнения домашнего задания создайте ветку с названием урока (Например Lesson_7). Для каждого метода создавайте отдельный класс. Все классы поместите в один пакет (Например lesson_7). После выполнения ДЗ сделайте commit (git commit) и загрузите его в удаленный репозиторий  GitHub (git push).

// Реализовать сохранение данных в csv файл;

// Реализовать загрузку данных из csv файла. Файл читается целиком.


// Структура csv файла:


//Строка заголовок с набором столбцов

// Набор строк с целочисленными значениями


// * Разделитель между столбцами - символ точка с запятой (;)
public class Main {
    public static void main(String[] args) {
        AppData appData = new AppData();

        appData.load("example.csv");

        System.out.println(Arrays.toString(appData.getHeader()));

        System.out.println(Arrays.deepToString(appData.getData()));

        appData.save("result.csv");
    }
}
