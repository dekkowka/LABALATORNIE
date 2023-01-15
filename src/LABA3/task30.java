package LABA3;

import java.util.Random;

public class task30 {
    public static void main(String[] args) {
        int n = 10;
        int[] mas = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = getRandomInt(1, 20);
            System.out.println(mas[i]);
        }

        for (int i = 0; i < n; i++) {
            int max = mas[i];
            int max_i = i;
            for (int j = i + 1; j < n; j++) {
                if (mas[j] > max) {
                    max = mas[j];
                    max_i = j;
                }
            }
            if (i != max_i) {
                int tmp = mas[i];
                mas[i] = mas[max_i];
                mas[max_i] = tmp;
            }
        }
        System.out.println("Массив:");
        for (int i = 0; i < n; i++) {
            System.out.println(mas[i]);
        }

    }

    public static int getRandomInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}