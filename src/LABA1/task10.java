package LABA1;

import java.util.Scanner;

public class task10
{
    public static void main(String[] args) {
        System.out.println("Введите Ваш возраст:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("Вы родились в " + (2022 - age) + " году.");
    }
}
