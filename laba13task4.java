package LABA13;

public class laba13task4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
        }
    }
}

