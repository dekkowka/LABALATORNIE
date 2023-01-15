package LABA3;

import java.util.Random;

public class task29 {
    public static void main(String[] args) {
        int n = 10;
        int[] mas = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = getRandomInt(1, 20);
            System.out.println(mas[i]);
        }

        int min = mas[0];
        for (int i = 0; i < n; i++) {
            if (mas[i] < min)
                min = mas[i];
        }
        System.out.println("Минимальный элемент " + min);

        System.out.println("C индексом(ами) ");
        for (int i = 0; i < n; i++) {
            if (min == mas[i])
                System.out.println("idx: " + i);
        }
    }

    public static int getRandomInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}