package com.lesson_4.task7;
//Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
public class ParkApp {
    public static void main(String[] args) {
        Park park = new Park("Amusement park");
        park.addAttraction("Carnival Ride", "8.00 to 20.00", 7.99f);
        park.addAttraction("Baloon Race", "8.00 to 21.00", 4.99f);
        park.addAttraction("Hyper Booster", "8.00 to 20.30", 8.99f);

        park.displayParkInfo();
    }
}
