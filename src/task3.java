import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month_name: ");
        String month_name = in.nextLine();

        System.out.println("Input weekday: ");
        String weekday = in.nextLine();

        System.out.println("Input day of month: ");
        String day_of_month = in.nextLine();

        System.out.println(weekday + " "+ month_name + " " + day_of_month);
        in.close();

    }
}
