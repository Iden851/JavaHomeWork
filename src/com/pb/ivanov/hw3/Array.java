package com.pb.ivanov.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] array = new int[10];

        // Заполнение массива.
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива: ");
            array[i] = in.nextInt();
        }

        // Вывод на экран значений элементов массива.
        System.out.println("Вы ввели массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Вычисление суммы элементов массива
        int sumAll = 0;
        for (int i = 0; i < array.length; i++) {
            sumAll = sumAll + array[i];
        }
        System.out.println("Сумма всех элементов массива: " + sumAll);

        //Подсчитать и вывести на экран количество положительных элементов
        int positiveEl = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveEl++;
            }
        }
        System.out.println("Количество положительных элементов массива: " + positiveEl);

        //Произвести сортировку этого массива от меньшего к большему
        // по алгоритму сортировки пузырьком

        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        //вывод отсортированного массива на экран
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
