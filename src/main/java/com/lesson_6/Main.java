package com.lesson_6;

//Напишите метод, на вход которого подается двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

//Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

//В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.



public class Main {
    public static String[][] strings = {{"1","3","4","4"},
                                        {"5","2","3","8"},
                                        {"8","2","5","4"},
                                        {"3","2","3","3"}};

    public static void main(String[] args) {

        try {
            System.out.println("Sum value in array " + testArray(strings));
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }
    }

    private static int testArray(String[][] strings) throws MyArraySizeException{
        if (strings.length != 4 || strings [0].length !=4){
            throw new MyArraySizeException();
        }

        int result = 0;
        int x = 0;

        for (String[] strings1: strings){
            int y = 0;
            for (String s: strings1){
                try {
                    result += Integer.parseInt(s);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(x,y,s);
                }
                y++;
            }
            x++;
        }
        return result;
    }
}
