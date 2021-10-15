package com.pb.ivanov.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число от 0 до 100: ");
        int number = in.nextInt();

        if (number < 0) {
            System.out.println("Ошибка! Число " + number + " не в промежутке [0-100]");
        } else if (number > 100){
            System.out.println("Ошибка! Число " + number + " не в промежутке [0-100]");
        } else if (number <= 14){
            System.out.println("Число " + number + " в промежутке [0-14]");
        } else if (number <= 35){
            System.out.println("Число " + number + " в промежутке [15-35]");
        } else if (number <= 50){
            System.out.println("Число " + number + " в промежутке [36-50]");
        } else if (number <= 100){
            System.out.println("Число " + number + " в промежутке [51-100]");
        }
    }
}
