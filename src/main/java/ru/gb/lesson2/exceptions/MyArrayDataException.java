package ru.gb.lesson2.exceptions;

public class MyArrayDataException extends Exception {

    private int number;

    public int getNumber() {
        return number;
    }

    public MyArrayDataException(String msg, int number) {
        super(msg);
        this.number = number;
    }
}
