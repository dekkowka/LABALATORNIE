package LABA3;


public class task27 {

    public static void main(String[] args) {

        int n = 10;

        char[] Alfa = new char[n];

        char k = 'a';
        for (int i = 0; i < n; i++) {
            Alfa[i] = k;
            k += 2;

        }

        System.out.println("Прямой вывод");
        for (int i = 0; i < n; i++) {
            System.out.println(Alfa[i]);
        }
        System.out.println("Обратный вывод");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(Alfa[i]);
        }
    }
}
