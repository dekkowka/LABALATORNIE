package LABA2;

import java.util.Scanner;

public class z1005 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int num[] = new int[n];

        for (int i = 0; i < n; i++)
            num[i] = in.nextInt();

        int rez = Integer.MAX_VALUE;
        for (int c = 0; c < 1 << n; c++) {

            int drop1 = 0;
            int drop2 = 0;
            int k = c;

            for (int i = 0; i < n; i++) {
                if ((k & 1) > 0)
                    drop1 += num[i];
                else
                    drop2 += num[i];

                k >>= 1;
            }
            rez = Math.min(rez, Math.abs(drop1 - drop2));
        }

        System.out.println(rez);
        in.close();
    }
}