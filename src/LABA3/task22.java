package LABA3;

import java.util.Scanner;

public class task22 {

    public static void main(String[] args) {
        try (Scanner id = new Scanner(System.in)) {
            System.out.println("Введите название дня");
            String s = id.nextLine();
            // метод 1
            switch (s) {
                case "Monday":
                    System.out.println("1");
                    break;
                case "Tuesday":
                    System.out.println("2");
                    break;
                case "Wednesday ":
                    System.out.println("3");
                    break;
                case "Thursday":
                    System.out.println("4");
                    break;
                case "Friday ":
                    System.out.println("5");
                    break;
                case "Saturday ":
                    System.out.println("6");
                    break;
                case "Sunday":
                    System.out.println("7");
                    break;
                default:
                    System.out.println("Ввденное слово не соотвествуют дню недели. Пример: Monday");
                    break;
            }
            // метод 2
            if (s.equals("Monday"))
                System.out.println("1");
            else if (s.equals("Tuesday"))
                System.out.println("1");
            else if (s.equals("Wednesday"))
                System.out.println("1");
            else if (s.equals("Thursday"))
                System.out.println("1");
            else if (s.equals("Friday "))
                System.out.println("1");
            else if (s.equals("Saturday"))
                System.out.println("1");
            else if (s.equals("Sunday"))
                System.out.println("1");
            else
                System.out.println("Ввденное слово не соотвествуют дню недели. Пример: Monday");
        }
    }
}