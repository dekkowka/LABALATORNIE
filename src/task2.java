import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first name: ");
        String first_name = in.nextLine(); String[] arr = first_name.split(" ");

        System.out.println("name " + arr[0] + " "+ "age " + arr[1]);
        in.close();

    }
}
