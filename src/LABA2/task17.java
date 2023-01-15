package LABA2;

import java.util.Scanner;

public class task17 {

        public static void main(String[] args) {

            System.out.println("Введите число");
            Scanner in = new Scanner(System.in);

            int num = in.nextInt();

            if (num % 3 == 0 && num != 0) {
                System.out.printf("Введенное число делится на 3");
            } else {
                System.out.printf("Введенное число не делится на 3");
            }
            in.close();

        }
    }


