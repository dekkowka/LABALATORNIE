package LABA12;

import java.util.Scanner;
import java.util.List;

public class laba12task7 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список строк и " +
                "возвращает новый список, содержащий только те строки, которые имеют " +
                "длину больше заданного значения.";
        List<String> strings = List.of(string.split(","));
        System.out.println("\nСтрока после считывания: \n");
        for(String t : strings){
            System.out.println(t);
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину строки: ");
        int length = in.nextInt();

        List<String> stringAfter = filterLongStrings(strings, length);

        System.out.println("\nСтрока после фильтрации:\n");
        for(String u : stringAfter){
            System.out.println(u);
        }


    }

    public static List<String> filterLongStrings(List<String> strings, int length){
        return strings.stream().filter(s -> s.length() > length).toList();
    }
}


