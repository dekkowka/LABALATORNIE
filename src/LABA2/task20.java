import java.util.Scanner;

public class task20 {

    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if (num > 9999) {
            if (num < 1000000) {
                System.out.printf("Тысяч во введенном пользователе числе");
                System.out.println();
                System.out.println(num / 1000);
            } else {

                num = num / 1000;
                System.out.printf("Тысяч во введенном пользователе числе");
                System.out.println();
                System.out.println(num % 1000);
            }
        } else
            System.out.printf("Тысяч нет");

        in.close();
    }
}