package LABA6;

import java.text.DecimalFormat;

public class task53 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("\n Test 0: \n");
        int s1[] = { 1, 2, 3, 4, 5 };
        print(s1);
        System.out.println("Среднее значение массива " + df.format(arrays(s1)));

        System.out.println("\n Test 1: \n");
        int s2[] = { -10, 10 };
        print(s2);
        System.out.println("Среднее значение массива " + df.format(arrays(s2)));

        System.out.println("\n Test 2: \n");
        int s3[] = { -10, 10, 10 };
        print(s3);
        System.out.println("Среднее значение массива " + df.format(arrays(s3)));

        System.out.println("\n Test 4: \n");
        int s4[] = { -100, -20, 0, -54, -334, -2, -23 };
        print(s4);
        System.out.println("Среднее значение массива " + df.format(arrays(s4)));
    }

    public static void print(int arr3[]) {
        System.out.print(" NEW Mass : \n");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print("i : " + i + ", arr[i]: " + arr3[i] + "\n");
        }
    }

    public static double arrays(int arr2[]) {
        int sum = 0;
        double sr = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum = sum + arr2[i];
        }
        if (sum != 0)
            sr = (double) sum / arr2.length;
        else
            sr = 0.00;
        return sr;
    }

}
