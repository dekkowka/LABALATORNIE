package LABA6;


public class task50 {

    public static void main(String[] args) {
        System.out.println("\n Test 0: \n");
        rect1(5);
        rect2(5);
        System.out.println("\n Test 1: \n");
        rect1(6);
        rect2(6);

        System.out.println("\n Test 2: \n");
        rect1(10);
        rect2(10);
        System.out.println("\n Test 3: \n");
        rect1(11);
        rect2(11);
    }

    public static void rect1(int n) {
        System.out.println("NotRecursia : " + (int) (notrecursia(n)));
    }

    public static void rect2(int n) {
        System.out.println("Recursia : " + (int) (recursia(n)));
    }

    public static double notrecursia(int n) {
        double sum = 0;
        for (int i = 0; i <= n; i++)
            sum = sum + Math.pow(i, 2);
        return sum;
    }

    public static double recursia(int n) {
        if (n <= 1)
            return 1;
        else
            return n * n + recursia(n - 1);
    }

}
