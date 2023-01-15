package LABA4;

public class task33 {
    public static void main(String[] args) {
        int height = 11;
        int width = 23;
        int arr[][]= new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                arr[i][j]=2;
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Массив, который выводит прямоугольник с высотой " + height + " и шириной " + width);
    }
}
