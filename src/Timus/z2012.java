package Timus;

import java.util.Scanner;

public class z2012 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int b = 12 - a;

        int c = b * 45;

        if (c <= 240) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}