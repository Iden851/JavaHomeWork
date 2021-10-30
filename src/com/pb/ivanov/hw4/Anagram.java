package com.pb.ivanov.hw4;

import java.util.Arrays;
import java.util.Scanner;


public class Anagram {

    static void isItAnagram(String str1, String str2){
            // приводим к единому регистру
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
            // выбираем только буквы и цыфры
        String str3 = str1.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]","");
        String str4 = str2.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]","");
            // переводим строки в массив и сортируем их
        char[] char1 = str3.toCharArray();
        char[] char2 = str4.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
            // сравниваем массивы
        if (Arrays.equals(char1, char2)){
            System.out.println("Ура! Это анаграмма!");
        } else {
            System.out.println("Увы - это не анаграмма.");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое предложение: ");
        String usersString1 = in.nextLine();
        System.out.println("Введите второе предложение: ");
        String usersString2 = in.nextLine();

        isItAnagram(usersString1, usersString2);


    }
}
