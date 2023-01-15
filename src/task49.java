package LABA6;


public class task49 {

    public static void main(String[] args) {
        System.out.println("\n Test 0: \n");
        fact1(5);
        fact2(5);
        System.out.println("\n Test 1: \n");
        fact1(6);
        fact2(6);
        System.out.println("\n Test 3: \n");
        fact1(10);
        fact2(10);
        System.out.println("\n Test 4: \n");
        fact1(11);
        fact2(11);
    }

    public static void fact1(int n) {
        System.out.println("NotRecursia : " + (notrecursia(n)));
    }

    public static void fact2(int n) {
        System.out.println("Recursia : " + (recursia(n)));
    }

    public static int notrecursia(int n) {
        int i;
        if (n % 2 == 0)
            i = 0;
        else
            i = 1;
        int sum = 1;
        while (n > i) {
            sum = sum * n;
            n = n - 2;
        }
        return sum;
    }

    public static int recursia(int n) {
        if (n <= 1)
            return 1;
        else
            return n * recursia(n - 2);
    }

}