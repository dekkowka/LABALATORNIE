package LR9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str ="Ввод строки вместо числа";
        int summa=0;
        System.out.print("Введите размерность массива: ");
        try {

            int size = in.nextInt();
            byte array[] = new byte[size];
            try {

                for (int i = 0; i < size; i++) {

                    System.out.println("Введите " + i + "-й элемент массива:");
                    array[i] = in.nextByte();
                    summa+=array[i];
                }

                for (int i = 0; i < size; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
                if (summa <-128||summa >127)
                {
                    str = "Выход за границы диапазона типа Byte";
                    throw new InputMismatchException(str);
                }
                else
                {
                    System.out.println("Сумма элементов: "+summa);
                }

            } catch (InputMismatchException e) {
                System.out.println("Ошибка! "+str+".");
            }
        }
        catch (InputMismatchException e )
        {
            System.out.println("Ошибка! Ввод строки вместо числа.");
        }

    }
}