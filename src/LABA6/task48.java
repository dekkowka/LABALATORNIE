package LABA6;


import java.util.ArrayList;

public class task48 {

    public static void main(String[] args) {
        System.out.println("\nTest 0: \n");
        Zero3.lego(123, 1, 5);
        Zero3.check();
        Zero3.print();

        System.out.println("\n Test 2: \n");
        Zero3.lego(3, 15, 515, -3);
        Zero3.check();
        Zero3.print();

        System.out.println("\n Test 3: \n");
        int arr[] = { 1, 20, 50, -20, 2342 };
        Zero3.lego(arr);
        Zero3.check();
        Zero3.print();
    }

}

class Zero3 {
    private static ArrayList<Integer> arr = new ArrayList<Integer>();;
    private static int min = Integer.MAX_VALUE;
    private static int max = Integer.MIN_VALUE;
    private static int sr = 0;

    public static void print() {
        for (int i = 0; i <= arr.size() - 1; i++)
            System.out.println("i = " + i + ", arr = " + arr.get(i));

    }

    public static void check() {
        min();
        max();
        sr();
        System.out.println("min = " + min + ", max = " + max + ", sr = " + sr + "\n");
    }

    public static void min() {
        for (int i = 0; i <= arr.size() - 1; i++)
            if (min > arr.get(i))
                min = arr.get(i);
    }

    public static void max() {
        for (int i = 0; i <= arr.size() - 1; i++)
            if (max < arr.get(i))
                max = arr.get(i);
    }

    public static void sr() {
        int sum = 0;
        for (int i = 0; i <= arr.size() - 1; i++)
            sum = sum + arr.get(i);
        sr = sum / arr.size();

    }

    public static void lego(int... a) {
        for (int i = 0; i < a.length; i++)
            arr.add(a[i]);

    }

    public static void lego2(int arr2[]) {
        for (int i = 0; i < arr2.length; i++)
            arr.add(arr2[i]);
    }
}
