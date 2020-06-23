package ru.gb.lesson2.exceptions;

public class MyArraySizeException extends Exception {

    private int number;

    public int getNumber() {
        return number;
    }

    public MyArraySizeException(String msg, int number) {
        super(msg);
        this.number = number;
    }
}
