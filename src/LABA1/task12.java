package LABA1;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberMinusOne = number - 1;
        int numberPlusOne = number + 1;
        int sum = number + numberMinusOne + numberPlusOne;
        int numberSquared = (int) Math.pow(sum, 2);
        System.out.println(numberMinusOne + " " + number + " " + numberPlusOne + " " + numberSquared);
    }
}
