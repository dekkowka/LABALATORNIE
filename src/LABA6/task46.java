package LABA6;


public class task46 {

    public static void main(String[] args) {
        System.out.println("Test 0: ");
        Zero one = new Zero();
        one.lego('a');
        one.check();
        System.out.println("Test 1: ");
        Zero one2 = new Zero();
        one2.lego("fdfdf");
        one2.check();
        System.out.println("Test 2: ");
        char arr[] = { 'a', 'b', 'c' };
        Zero one3 = new Zero();
        one3.lego(arr);
        one3.check();
        System.out.println("Test 3: ");
        char arr2[] = { 'a' };
        Zero one4 = new Zero();
        one4.lego(arr2);
        one4.check();
    }
}

class Zero {
    private String zeroString = null;
    private char zeroChar = ' ';

    public void check() {
        if (zeroString != null)
            System.out.println("Sting = " + this.zeroString + "\n");
        if (zeroChar != ' ')
            System.out.println("Char = " + this.zeroChar + "\n");
    }

    public void lego(char a) {
        this.zeroChar = a;
    }

    public void lego(String a) {
        this.zeroString = a;
    }

    public void lego(char arr[]) {
        String s;
        char c;
        if (arr.length == 1) {
            c = arr[0];
            lego(c);
        } else {
            s = new String(arr);
            lego(s);
        }
    }

    public static int[] arrays(int[] s3, int i) {
        return null;
    }

}