package com.lesson_3;

import java.util.Arrays;


        //Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        //Конструктор класса должен заполнять эти поля при создании объекта.
        //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        //Создать массив из 5 сотрудников.


public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Petrenko Vasiliy","QA","qa4@gmail.com","0961110033",11200,42);
        employees[1] = new Employee("Kravchenko Vasiliy","AQA","qa1@gmail.com","0969990033",10200,25);
        employees[2] = new Employee("Tabachenko Eduard","PM","qa3@gmail.com","0961119999",12000,40);
        employees[3] = new Employee("Petrenko Vladimir","BA","qa5@gmail.com","0971110033",92000,45);
        employees[4] = new Employee("Gradilenko Vladimir","AQA","qa8@gmail.com","0967770033",11200,28);

        for (Employee employee: employees)
            if (employee.getAge()>=40)
                System.out.println(employee);
    }
}
