package LABA4;


public class task37 {
    public static void main(String[] args) {

        int a = 3;
        int b = 10;
        int arr[][] = new int[a][b];
        int max;

        System.out.println("массив" + " cтрок " + a + " столбиков " + b);
        if (a == b)
            max = a + b;
        else if (b > a)
            max = a + a + 1;
        else
            max = a + a - 1;

        int l = 0;
        int m = b - 1;

        int k = 0;

        while (k < max) {

            if (k % 2 == 0) {
                if (l < a && b - l >= 0) {
                    for (int i = 0; i < b - l; i++)
                        arr[l][i] = k;
                    l++;
                }
            } else {
                if (m >= 0) {
                    for (int j = a - 1; j >= 0 + l; j--)
                        arr[j][m] = k;
                    m--;
                }
            }
            k++;
        }

        System.out.println("Ходов змейкой: " + (max - 1));

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
