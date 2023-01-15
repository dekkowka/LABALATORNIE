package LABA3;

public class task28 {
    public static void main(String[] args) {
        int n = 10;

        char[] Alfa = new char[n];

        char k = 'B';
        int j = 0;
        while (j < n) {
            if (k != 'A' && k != 'E' && k != 'I' && k != 'O' && k != 'U' && k != 'Y') {
                Alfa[j] = k;
                j++;
            }
            k += 1;
        }

        System.out.println("Массив:");
        for (int i = 0; i < n; i++) {
            System.out.println(Alfa[i]);
        }

    }

}

