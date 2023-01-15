package LABA4;

public class task31 {
    public static void main(String[] args) {
        int height = 11;
        int width = 23;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
        System.out.println("Прямоугольник с высотой " + height + " и шириной " + width);
    }
}
