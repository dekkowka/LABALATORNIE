package LABA6;


public class task52 {

    public static void main(String[] args) {

        System.out.println("\n Test 0: \n");
        char s1[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
        print(s1);
        print(arrays(s1));

        System.out.println("\n Test 1: \n");
        char s2[] = { 'S', 's', 's', 'l' };
        print(s2);
        print(arrays(s2));

        System.out.println("\n Test 2: \n");
        char s3[] = { '4', '3', '2', '1', ' ', 'A', 'a', '-' };
        print(s3);
        print(arrays(s3));

    }

    public static void print(char arr3[]) {
        System.out.print(" OLD Mass : \n");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print("i : " + i + ", arr[i]: " + arr3[i] + "\n");
        }
    }

    public static void print(int arr3[]) {
        System.out.print(" NEW Mass : \n");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print("i : " + i + ", arr[i]: " + arr3[i] + "\n");
        }
    }

    public static int[] arrays(char arr2[]) {
        int arr[] = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            arr[i] = (int) arr2[i];
        }
        return arr;
    }

}
