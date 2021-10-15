package com.pb.ivanov.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int operand1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int operand2 = in.nextInt();

        System.out.print("Введите знак арифметической операции (+,-,*,/): ");
        String sign = in.next();

        int result = 0;
        char action = sign.charAt(0);

        switch (action) {
            case '+':
                result = operand1 + operand2;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.println("Результат: " + result);
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.print("Ошибка! На ноль делить нельзя!");
                } else {
                    result = operand1 / operand2;
                    System.out.println("Результат: " + result);
                }
                break;
            default:
                System.out.println("Неверная арифметическая операция");
        }
    }
}