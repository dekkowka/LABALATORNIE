import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        System.out.println("Введите два числа через пробел");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int sum = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        int dif = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
        System.out.println("Сумма двух введенных чисел " + sum);
        System.out.println("Разность двух введенны чисел " + dif);
    }
}
