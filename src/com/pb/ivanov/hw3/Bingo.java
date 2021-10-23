package com.pb.ivanov.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Угадайте число от 0 до 100. Количество попыток не ограничено.");
        System.out.println("Для выхода из программы введите - 101.");
        Random number = new Random();
        int x = number.nextInt(101);
        //System.out.println("rand x: " + x); // раскомментировать для проверки работы алгоритма

        Scanner in = new Scanner(System.in);


        int attempt = 0;

        while (true) {
            attempt++;
            System.out.print("Введите число: ");
            int usersNumber = in.nextInt();

            if (usersNumber == 101) {
                break;
            }
            if (usersNumber < x) {
                System.out.print("Загаданное число больше " + usersNumber + "! ");
                continue;
            } else if (usersNumber > x) {
                System.out.print("Загаданное число меньше " + usersNumber+ "! ");
                continue;
            }
            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
            break;
        }
        System.out.println("Игра окончена!");
    }
}
