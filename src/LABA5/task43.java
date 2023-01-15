package LABA5;

public class task43 {

    public static void main(String[] args) {
        Magic4 spell4 = new Magic4(65.4343);
        Magic4 spell5 = new Magic4('A', 4343);
        Magic4 spell41 = new Magic4(121.3);
        Magic4 spell43 = new Magic4(41.234442);

    }

}

class Magic4 {
    private char key_btn;
    private int clicks;

    Magic4(double a) {
        this.key_btn = (char) Math.round(a);
        if ((a * 1000 % Math.round(a) * 1000) % 10 > 0)
            this.clicks = (int) (a * 100 - Math.round(a) * 100);
        else
            this.clicks = (int) (a * 10 - Math.round(a) * 10);
        System.out.println("Cимвол: " + this.key_btn + ". Число " + this.clicks + "\n");
    }

    Magic4(char a, int b) {
        this.key_btn = a;
        this.clicks = b;
        System.out.println("Cимвол: " + this.key_btn + ". Число " + this.clicks + "\n");

    }

}