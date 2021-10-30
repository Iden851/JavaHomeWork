package com.pb.ivanov.hw4;

import java.util.Scanner;

public class CapitalLetter {

    static void upLetter( String str) {

                String[] strParts = str.split(" ");
                String str2 = "";
                for (int i = 0; i < strParts.length; i++) {
                    strParts[i] = strParts[i].substring(0, 1).toUpperCase() + strParts[i].substring(1);
                    str2 = str2 + strParts[i] + " ";
                }

            System.out.println(str2);
            }



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String usersString = in.nextLine();
        upLetter(usersString);

    }

}
