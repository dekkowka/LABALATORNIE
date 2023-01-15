package LABA4;

public class task32 {
    public static void main(String[] args) {
        int height = 3;
        int width = 4;
        int k = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (k > j) {
                    System.out.print("+");
                }
            }
            k++;
            System.out.println();
        }
        System.out.println(
                "Треугольник с высотой " + height + ", шириной " + width + " и площадью " + (height * width) / 2);
    }
}
