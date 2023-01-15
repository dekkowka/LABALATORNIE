package LABA2;

import java.util.Scanner;

public class task19 {

    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if (num > 4 && num < 10) {
            System.out.printf("Соотвествует условиям");
        } else {
            System.out.printf("Не соотвествует условиям");
        }

        in.close();
    }
}
