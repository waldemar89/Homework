package com.lesson_6;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int x, int y, String string) {
        super(String.format("Значение (%s) из массива в ячейке с координатами [%s,%s] нельзя привести к числу",string,x,y));
    }

}
