package LABA11;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number for conversion 10 in 2: ");
        int numb = in.nextInt();

        if (numb == 0){
            System.out.println("0");
        }else {
            System.out.println(conversion(numb));
        }



    }

    public static String conversion(int number){
        if (number == 0){
            return "";
        }
        return conversion(number/2) + (number % 2);
    }
}

