package LABA3;

import java.util.Scanner;

public class task23 {

    public static void main(String[] args) {
        try (Scanner id = new Scanner(System.in)) {
            System.out.println("Введите число");
            int n = id.nextInt();

            int[] f = new int[n];
            f[0] = 0;
            f[1] = 1;
            for (int i = 2; i < n; ++i) {
                f[i] = f[i - 1] + f[i - 2];
            }

            System.out.println("Чила фибоначи1");
            for (int i = 0; i < n; ++i) {
                System.out.println(f[i]);
            }

            int[] f2 = new int[n];
            f2[0] = 0;
            f2[1] = 1;
            int i = 2;
            while (i < n) {
                f2[i] = f2[i - 1] + f2[i - 2];
                i++;

            }

            System.out.println("Числа фибоначи 2");
            i = 0;
            while (i < n) {
                System.out.println(f[i]);
                i++;
            }
        }

    }
}
