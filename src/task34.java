package LABA4;

public class task34 {

    public static void main(String[] args) {
        int height = 11;
        int width = 23;
        int k = 1;
        int arr[][] = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (k > j) {
                    arr[i][j] = 2;
                } else
                    arr[i][j] = 0;
            }
            k++;
        }

        System.out.println("Треугольный вывод: ");
        k = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (k > j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            k++;
            System.out.println();
        }

        System.out.println("Обычный вывод: ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Массив, который выводит прямоугольник с высотой " + height + " и шириной " + width);
    }
}
