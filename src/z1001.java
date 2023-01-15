package LABA2;

import java.util.*;

public class z1001 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Long> numbers = new ArrayList<>();

        while (in.hasNextLong()) {
            long a = in.nextLong();
            numbers.add(a);
        }
        for (int i = numbers.size() - 1; i >= 0; i--) {
            double rez = Math.sqrt((double) numbers.get(i));
            System.out.printf("%.4f%n", rez);
        }
        in.close();
    }

}
