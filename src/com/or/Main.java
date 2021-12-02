package com.or;

public class Main {

    public static void main(String[] args) {

        angrams("Desperation", "A Rope Ends It".replaceAll("\\s", ""));

    }

    public static void angrams(String str1, String str2) {

        if (str1.length() != str2.length()) {

            System.out.println("These two strings are not an Angrams!");
        }

        char[] arrChar1 = str1.toLowerCase().toCharArray();
        char[] arrChar2 = str2.toLowerCase().toCharArray();

        int equalsCounter = 0;
        for (int i = 0; i < arrChar1.length; i++) {
            for (int j = 0; j < arrChar2.length; j++) {
                if (arrChar1[i] == arrChar2[j]) {
                    equalsCounter++;
                }
            }
        }
        for (int i = 0; i < arrChar1.length; i++) {
            for (int j = i + 1; j < arrChar1.length; j++) {
                if (arrChar1[i] == arrChar1[j]) {
                    equalsCounter--;
                }
            }
        }
        for (int i = 0; i < arrChar2.length; i++) {
            for (int j = i + 1; j < arrChar2.length; j++) {
                if (arrChar2[i] == arrChar2[j]) {
                    equalsCounter--;
                }
            }
        }
        if (equalsCounter == arrChar1.length) {
            System.out.println("These two strings are Angrams");
        } else {
            System.out.println("These two strings are not an Angrams");
        }
    }
}






