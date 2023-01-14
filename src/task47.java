package LABA6;


public class task47 {

    public static void main(String[] args) {
        System.out.println("\nTest 0: \n");
        for (int i = 0; i < 4; i++)
            Zero2.check();

        System.out.println("\n Test 1: \n");
        Zero2.check();
    }
}

class Zero2 {

    private static int count = 0;

    public static void check() {
        System.out.println("Cont = " + count + "\n");
        count = count + 1;
    }

}