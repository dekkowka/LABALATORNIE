package LABA5;

public class task45 {

    public static void main(String[] args) {
        Magic6 one = new Magic6(3);
        one.check();
        one.lego(10);
        one.check();
        one.lego(123);
        one.check();
        one.lego(123, -22);
        one.check();
        one.lego(10);
        one.check();
        Magic6 one2 = new Magic6(3, 100);
        one2.check();
        one2.lego(10, 1020);
        one2.check();
        one2.lego(-123);
        one2.check();
        one2.lego(10);

    }

}

class Magic6 {
    private int min = Integer.MAX_VALUE;
    private int max = -Integer.MAX_VALUE;

    public void check() {
        if (min == Integer.MAX_VALUE)
            System.out.println(" Max = " + max + "\n");
        else if (max == -Integer.MAX_VALUE)
            System.out.println("Min = " + min + "\n");
        else
            System.out.println("Min = " + min + ", Max = " + max + "\n");
    }

    public void lego(int a) {
        if (a < this.min || a == 0)
            this.min = a;
        else if (a > this.max)
            this.max = a;
    }

    public void lego(int a, int b) {
        if (a > b) {
            if (this.max < a)
                this.max = a;
            if (this.min > b)
                this.min = b;
        } else {
            if (this.max < b)
                this.max = b;
            if (this.min > a)
                this.min = a;
        }

    }

    Magic6(int a) { 
        System.out.println("Конструктор с аргументом " + a);
        this.lego(a);
    }

    Magic6(int a, int b) {
        System.out.println("Конструктор c аргументами " + a + " и " + b);
        this.lego(a, b);
    }

}