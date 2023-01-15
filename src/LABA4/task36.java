package LABA4;

import java.util.Random;

public class task36 {
    public static void main(String[] args) {

        int max = 9;
        int min = 2;
        int height = 5;
        int width = 5;
        int arr[][] = new int[height][width];

        System.out.println("исходный массив" + " cтрок " + height + " столбиков " + width);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                arr[i][j] = getRandomInt(min, max);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("новый массив");

        int del1 = getRandomInt(0, height - 1);

        int del2 = getRandomInt(0, width - 1);

        int arr2[][] = new int[height - 1][width - 1];
        int cof1 = 0;
        int cof2 = 0;
        for (int i = 0; i < height - 1; i++) {
            for (int j = 0; j < width - 1; j++) {
                if (i >= del1)
                    cof1 = 1;
                else
                    cof1 = 0;
                if (j >= del2)
                    cof2 = 1;
                else
                    cof2 = 0;
                arr2[i][j] = arr[i + cof1][j + cof2];
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Вывод индексов. Удаленный столбец " + del2 + ", удаленная строка " + del1);
    }

    public static int getRandomInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}