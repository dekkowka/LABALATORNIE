package LABA6;


public class task55 {

    public static void main(String[] args) {
        System.out.println("\nTest 0: \n");
        print(lego(123, 1, 5));

        System.out.println("\n Test 2: \n");
        print(lego(3, 15, 515, -3));

        System.out.println("\n Test 3: \n");
        print(lego(1, 20, 50, -20, 2342));
        System.out.println("\n Test 4: \n");
        print(lego(1));
        System.out.println("\n Test 5: \n");
        print(lego(5, 5, 5));
    }

    public static int[] lego(int... a) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (min > a[i])
                min = a[i];
            if (max < a[i])
                max = a[i];
        }
        int arr[] = new int[2];
        arr[0] = min;
        arr[1] = max;
        return arr;
    }

    public static void print(int arr2[]) {
        System.out.println("arr = " + arr2[0] + ", max = " + arr2[1] + "\n");
    }

}
