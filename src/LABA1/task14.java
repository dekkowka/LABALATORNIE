package LABA1;

import java.io.PrintWriter;
import java.util.Scanner;


public class task14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();

        int result = (N * (A*B)) * 2;


        out.println(result);
        out.flush();

    }
}