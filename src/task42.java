package LABA5;

public class task42 {

    public static void main(String[] args) {
        Magic3 spell4 = new Magic3();
        Magic3 spell5 = new Magic3(12);
        Magic3 spell6 = new Magic3(13, 18);

    }

}

class Magic3 {
    private int one_s;
    private int two_s;

    Magic3() {
        System.out.println("Без аргументов\n");

    }

    Magic3(int a) {
        this.one_s = a;
        System.out.println("С одним аргументом: " + this.one_s + "\n");
    }

    Magic3(int a, int b) {
        this.one_s = a;
        this.two_s = b;
        System.out.println("C двумя аргументами: " + this.one_s + " и " + this.two_s + "\n");

    }

}