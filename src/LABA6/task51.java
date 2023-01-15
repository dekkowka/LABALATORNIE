package LABA6;


public class task51 {

    public static void main(String[] args) {
        int s1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("\n Исходный");
        print(s1);
        System.out.println("\n Test 0: \n");
        // Zero6.arrays(s,5);
        print(arrays(s1, 5));

        System.out.println("\n Test 1: \n");
        print(arrays(s1, 15));

        System.out.println("\n Test 2: \n");
        print(arrays(s1, 9));

        System.out.println("\n Test 3: \n");
        print(arrays(s1, 3));
    }

    public static void print(int arr3[]) {
        System.out.print(" Mass : \n");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print("i : " + i + ", arr[i]: " + arr3[i] + "\n");
        }
    }

    public static int[] arrays(int arr2[], int n) {

        if (arr2.length < n) {
            int arr[] = arr2;
            return arr;
        } else {
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = arr2[i];
            }
            return arr;
        }

    }

}
