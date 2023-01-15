package LABA3;

import java.util.Scanner;

public class task26 {

    public static void main(String[] args) {
        try (Scanner id = new Scanner(System.in)) {

            System.out.println("Введите Число");
            int n = id.nextInt();
            if (n > 1 && n < Integer.MAX_VALUE) {
                int[] mas = new int[n];

                int k = 0;
                int l = 1;

                while (k < n) {
                    if (l % 5 == 2) {
                        mas[k] = l;
                        k++;
                    }
                    l++;
                }

                System.out.println("Массив");

                for (int i = 0; i < n; i++) {
                    System.out.println(mas[i]);
                }

            } else
                System.out.println("Положительное число больше нуля и меньше " + Integer.MAX_VALUE);

        }
    }

}