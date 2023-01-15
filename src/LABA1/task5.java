package LABA1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;


public class task5 {
    public static void main(String[] args) throws Exception {

        System.out.println("Введите вашу дату рождения в формате: 10-05-1991");
        Scanner scanner = new Scanner(System.in);
        String birthday = scanner.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDateObj = LocalDate.parse(birthday, dateTimeFormatter);

        LocalDate today = LocalDate.now();

        Period p = Period.between(localDateObj, today);

        System.out.println("Вам " + p.getYears());
        scanner.close();
    }
}
