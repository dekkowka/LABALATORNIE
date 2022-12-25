package LABA5;

public class task44 {

    public static void main(String[] args) {
        Magic5 spell5 = new Magic5();
        spell5.lego(132);
        spell5.check();
        spell5.lego();
        spell5.check();
        spell5.lego(33);
        spell5.check();
        Magic5 spell6 = new Magic5();
        spell6.check();
        Magic5 spell7 = new Magic5(213);
        spell7.check();

    }

}

class Magic5 {
    private int age;

    public void check() {
        System.out.println("Число = " + age + "\n");
    }

    public void lego() {
        this.age = 0;
    }

    public void lego(int a) {
        if (a >= 100)
            this.age = 100;
        else
            this.age = a;

    }

    Magic5(int a) {
        System.out.println("Конструктор с аргументом " + a);
        this.lego(a);
    }

    Magic5() {
        System.out.println("Конструктор без аргументов");
        this.lego();
    }

}