package LABA4;

import java.util.Scanner;

// package com.company;
public class task38 {
    public static void main(String[] args) {
        try (Scanner id = new Scanner(System.in)) {
            System.out.println("Введите текст для шифрования");
            String text_in = id.nextLine();

            System.out.println("Введите ключ");
            if (id.hasNextInt()) {
                int text_key = id.nextInt();
                String a = id.nextLine(); // После nextInt остается строка в считывании, и следом nextLine пытается
                // считать пустоту, а последующий уже данные

                String text_out = getEncryptString(text_in, text_key);

                System.out.println("Текст после преобразования: " + text_out);

                boolean f = true;
                while (f) {
                    System.out.println("Выполнить обратноe преобразование? (y/n)");
                    if (id.hasNextLine()) {

                        String answer = id.nextLine();
                        switch (answer) {
                            case "y":
                                String text_out2 = getEncryptString(text_out, -text_key);
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

            else
                System.out.println("Ключом должно быть число!");
        }
    }

    public static String getEncryptString(String encryptString, int shift) {
        char[] ArrayChar = encryptString.toCharArray();
        long[] ArrayInt = new long[ArrayChar.length];
        char[] ArrayCharNew = new char[ArrayChar.length];
        for (int i = 0; i < ArrayChar.length; i++) {
            ArrayInt[i] = ArrayChar[i] + shift;
            ArrayCharNew[i] = (char) ArrayInt[i];
        }
        encryptString = new String(ArrayCharNew);
        return encryptString;
    }
}