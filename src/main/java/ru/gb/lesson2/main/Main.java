package ru.gb.lesson2.main;

import ru.gb.lesson2.DayOfWeek;
import ru.gb.lesson2.exceptions.MyArrayDataException;
import ru.gb.lesson2.exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {

        //Массив с неправильным размером
        try {
            arrayParsedElementsSum(new String[][]{{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}});
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage() + " " + e.getNumber());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        //Массив с неправильным размером вложенного элемента
        try {
            arrayParsedElementsSum(new String[][]{{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1"}});
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        //Массив с неправильным форматом данных
        try {
            arrayParsedElementsSum(new String[][]{{"1", "1", "1", "1"}, {"abc", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}});
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        //Массив с возможностью возврата суммы элементов
        try {
            System.out.println("Сумма элементов массива: " + arrayParsedElementsSum(new String[][]{{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}}));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        //Вызов метода из класса DayOfWeek
        System.out.println(DayOfWeek.getWorkingHours(DayOfWeek.MONDAY));
        System.out.println(DayOfWeek.getWorkingHours(DayOfWeek.FRIDAY));
        System.out.println(DayOfWeek.getWorkingHours(DayOfWeek.SUNDAY));

    }

    /*1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
    при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
    должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.*/

    public static int arrayParsedElementsSum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int arrayLength = 4;
        int result = 0;
        if (!(array.length == arrayLength)) {
            throw new MyArraySizeException("Неверный размер массива ", array.length);
        } else {
            for (int i = 0; i < array.length; i++) {
                if (!(array[i].length == arrayLength)) {
                    throw new MyArraySizeException(String.format("Неверный размер массива: размер %d в элементе %d", array[i].length, i), array[i].length);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Неверный формат данных в элементе массива по индексу: [%d][%d]", i, j), i);
                }
            }

        }
        return result;
    }
}


