package LR9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j;
        int row=0;
        int array[][] = new int[4][4];
        int array2[] = new int[4];
        for (i = 0; i < 4; ++i) {
            for (j = 0; j < 4; ++j) {
                array[i][j] = (i * 4) + j + 10;
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Введите номер столбца (начиная с 1)");
        try{
            int nomer = in.nextInt();
            try{
                for (;row<4;row++)
                {
                    array2[row] = array[row][nomer-1];
                    System.out.println(array2[row] +" ");
                }
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Ошибка! Нет столбца с таким номером.");
            }

        }
        catch (InputMismatchException e)
        {
            System.out.println("Ошибка! Ввод строки вместо числа.");
        }
    }
}
