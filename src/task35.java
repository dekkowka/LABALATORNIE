package LABA4;

public class task35 {
    public static void main(String[] args) {
        int height = 11;
        int width = 23;
        int k = 1;
        int arr[][]= new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (k > j) {
                    arr[i][j] = 2;
                } else
                    arr[i][j] = 0;
            }
            k++;
        }

        System.out.println("Исходный массив: ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        int arr2[][]= new int[width][height];
        for (int i = 0; i < width ; i++) {
            for (int j = 0; j < height; j++) {
                arr2[i][j]=arr[j][i];
            }
        }

        System.out.println("Новый массив: ");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
