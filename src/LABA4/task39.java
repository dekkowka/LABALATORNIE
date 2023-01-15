package LABA4;

import java.util.Scanner;

// package com.company;
public class task39 {

    public static void main(String[] args) {

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
        char[] code = "qwertyuiopasdfghjklzxcvnbm=.,*{}<>][".toCharArray();

        try (Scanner id = new Scanner(System.in)) {
            System.out.println("Введите текст для шифрования");
            String text_in = id.nextLine();
            String text_out = getCript(text_in, code, alphabet);
            System.out.println("Текст после преобразования: " + text_out);

            boolean f = true;
            while (f) {
                System.out.println("Выполнить обратноe преобразование? (y/n)");
                if (id.hasNextLine()) {

                    String answer = id.nextLine();
                    switch (answer) {
                        case "y":
                            // String text_out2 = getCript(text_in, alphabet,code);
                            String text_out2 = reGetCript(text_in, code, alphabet);
                            System.out.println("Текст после обратного преобразования: " + text_out2);
                            f = false;
                            break;
                        case "n":
                            System.out.println("Досвидания!");
                            f = false;
                            break;
                        default:
                            System.out.println("Введите корректный ответ");
                            break;
                    }
                }
            }

        }
    }

    public static String getCript(String text_in, char[] code, char[] alphabet) {
        boolean f = true;
        char[] tChar = text_in.toCharArray();
        long[] tInt = new long[tChar.length];

        long[] cInt = new long[code.length];
        long[] aInt = new long[alphabet.length];
        char[] arrCA = new char[tChar.length];

        for (int i = 0; i < alphabet.length; i++) {
            aInt[i] = alphabet[i];
        }
        for (int i = 0; i < tChar.length; i++) {
            tInt[i] = tChar[i];
        }
        for (int i = 0; i < code.length; i++) {
            cInt[i] = code[i];
        }

        for (int i = 0; i < tInt.length; i++) {
            f = true;
            for (int j = 0; j < aInt.length; j++) {
                if (tInt[i] == aInt[j]) {
                    arrCA[i] = (char) cInt[j];
                    f = false;
                }
            }
            if (f) {
                arrCA[i] = (char) tInt[i];
            }
        }
        String s = new String(arrCA);
        return s;
    }

    public static String reGetCript(String text_in, char[] code, char[] alphabet) {
        String s;
        boolean f = true;
        char[] tChar = text_in.toCharArray();
        long[] tInt = new long[tChar.length];

        long[] cInt = new long[code.length];
        long[] aInt = new long[alphabet.length];
        char[] arrCA = new char[tChar.length];

        for (int i = 0; i < alphabet.length; i++) {
            aInt[i] = alphabet[i];
        }
        for (int i = 0; i < tChar.length; i++) {
            tInt[i] = tChar[i];
        }
        for (int i = 0; i < code.length; i++) {
            cInt[i] = code[i];
        }

        for (int i = 0; i < tInt.length; i++) {
            f = true;
            for (int j = 0; j < cInt.length; j++) {
                if (tInt[i] == cInt[j]) {
                    arrCA[i] = (char) cInt[j];
                    f = false;
                }
            }
            if (f) {
                arrCA[i] = (char) tInt[i];
            }
        }
        s = new String(arrCA);
        return s;
    }

}
