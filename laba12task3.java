package LABA12;

    import java.util.List;
import java.util.stream.Collectors;

    public class laba12task3 {
        public static void main(String[] args) {
            String string = "Напишите функцию, которая принимает на вход список строк и" +
                    "возвращает новый список, содержащий только те строки, которые" +
                    "начинаются с большой буквы.";

            List<String> strings = List.of(string.split(","));
            System.out.println("\nСтрока после считывания: \n");
            for(String u : strings){
                System.out.println(u);
            }
            List<String> stringAfter = filterCapitalizedStrings(strings);

            System.out.println("\nСтрока после фильтрации:\n");
            for(String t : stringAfter){
                System.out.println(t);
            }
        }

        public static List<String> filterCapitalizedStrings(List<String> strings){
            return strings.stream().filter(s -> Character.isUpperCase(s.charAt(0))).collect(Collectors.toList());
        }
    }


