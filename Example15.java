package LR9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] x = new int[5];
        int summa =0;
        int kolvo=0;
        int srednee;
        try {
            System.out.print("Введите [0] элемент : ");
            x[0] = in.nextInt();
            System.out.print("Введите [1] элемент : ");
            x[1] = in.nextInt();
            System.out.print("Введите [2] элемент : ");
            x[2] = in.nextInt();
            System.out.print("Введите [3] элемент : ");
            x[3] = in.nextInt();
            System.out.print("Введите [4] элемент : ");
            x[4] = in.nextInt();
            for (int i = 0; i < x.length; i++) {
                if (x[i] > 0) {
                    summa += x[i];
                    kolvo++;
                }
            }
            try {
                srednee = summa/kolvo;
                System.out.println("Сумма положительных чисел = "+summa);
                System.out.println("Количество положительных чисел = "+kolvo);
                System.out.println("Среднее значение = "+srednee);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Ошибка! Положительные элементы отсутствуют.");
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Ошибка! Ввод строки либо несоответствие числового типа данных.");
        }
    }
}
