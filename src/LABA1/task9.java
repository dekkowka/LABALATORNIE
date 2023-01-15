package LABA1;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        System.out.println("Введите имя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Введите год рождения");
        int year = Integer.parseInt(scanner.nextLine());
        int age = 2022 - year;
        System.out.println("Имя: " + name + ", Возраст: " + age);

    }
}