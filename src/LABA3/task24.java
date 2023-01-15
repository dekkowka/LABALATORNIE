package LABA3;

import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        try (Scanner id = new Scanner(System.in)) {
            System.out.println("Введите Число 1");
            int a = id.nextInt();
            System.out.println("Введите Число 2");
            int b = id.nextInt();
            int max = a;
            int min = b;
            if (b > a) {
                max = b;
                min = a;
            }

            if (a != b) {
                System.out.println("Метод 1");

                for (int i = min; i <= max; i++) {
                    System.out.println(i);
                }

                System.out.println("Метод 2");
                int i = min;
                while (i <= max) {
                    System.out.println(i);
                    i++;
                }
            }

            System.out.println("Числа равны " + a);

        }
    }
}