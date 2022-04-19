package com.lesson_4.task6;
//Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
public class Main {
    public static void main (String[] args){
        Payment pay = new Payment();
        pay.setPayment();

        System.out.println("You have to pay " + pay.getPayment() + " hrivnas for:");
        pay.print();
    }
}
