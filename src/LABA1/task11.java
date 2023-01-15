package LABA1;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        System.out.println("Сумма двух чисел: " + sum);
    }
}
