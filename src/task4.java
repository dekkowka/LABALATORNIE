import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("введите месяц: ");
        String months = in.nextLine();
        System.out.println("введите кол-во дней: ");
        String days = in.nextLine();

        System.out.println("месяц: "+ months+"\n кол-во дней: " + days);
        in.close();

    }
}
