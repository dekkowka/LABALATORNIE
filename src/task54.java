package LABA6;


public class task54 {

    public static void main(String[] args) {

        System.out.println("\n Test 0: \n");
        char s1[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
        print(s1);
        arrays(s1);
        print(s1);
        System.out.println("\n Test 1: \n");
        char s2[] = { 'S', 's', 's', 'l' };
        print(s2);
        arrays(s2);
        print(s2);
        System.out.println("\n Test 2: \n");
        char s3[] = { '4', '3', '2', ' ', 'A', 'a', '-' };
        print(s3);
        arrays(s3);
        print(s3);
        System.out.println("\n Test 4: \n");
        char s4[] = { '4', '3', '2' };
        print(s4);
        arrays(s4);
        print(s4);

    }

    public static void print(char arr3[]) {
        System.out.print(" Mass : \n");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print("i : " + i + ", arr[i]: " + arr3[i] + "\n");
        }
    }

    public static void arrays(char arr2[]) {
        char swap;
        for (int i = 0; i < (arr2.length / 2); i++) {
            swap = arr2[i];
            arr2[i] = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = swap;
        }
    }

}
