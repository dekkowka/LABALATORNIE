package LABA3;

import java.util.Scanner;

public class task25 {

    public static void main(String[] args) {
        try (Scanner id = new Scanner(System.in)) {

            System.out.println("Введите Число");
            int n = id.nextInt();

            int k = 0;
            int l = 1;
            int sum = 0;

            System.out.println("Метод 1");
            while (k < n) {
                if (l % 5 == 2 && l % 3 == 1) {
                    sum = sum + l;
                    k++;
                    System.out.println(l);
                }
                l++;
            }
            System.out.println("Сумма чисел равна " + sum);

            // версия 2
            int sum2 = 0;
            l = 1;
            k = 0;
            System.out.println("Метод 2");
            do {
                if (l % 5 == 2 && l % 3 == 1) {
                    sum2 = sum2 + l;
                    k++;
                    System.out.println(l);
                }
                l++;
            } while (k < n);
            System.out.println("Сумма чисел равна " + sum2);

        }
    }

}