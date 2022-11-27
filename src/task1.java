import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input second name: ");
        String second_name = in.nextLine();
        System.out.println("Input first name: ");
        String first_name = in.nextLine();
        System.out.println("Input middle_name: ");
        String middle_name = in.nextLine();

        System.out.println("Hello " + second_name + " "+ first_name + " " + middle_name);
        in.close();

    }
}
