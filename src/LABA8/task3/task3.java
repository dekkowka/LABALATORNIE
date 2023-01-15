package LABA8.task3;

import java.io.*;

public class task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out=null;
        try {
            String letters = "бБвВгГдДжЖзЗйЙкКлЛмМнНпПрРсСтТфФхХцЦчЧшШщЩ";
            // Создание потоков
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/LABA8/task3/Текст для тестирования.txt"),"UTF8"));
            File f1 = new File("src/LABA8/task3/Результат.txt");
            f1.createNewFile(); //создание файла
            out = new PrintWriter("src/LABA8/task3/Результат.txt","UTF8");
            int lineCount = 0;
            int wordCount = 0;
            String s;
            char sym;
            while ((s = br.readLine()) != null) {
                wordCount = 0;
                if (s.length() != 0) {
                    out.print("Строка № " + lineCount + ": ");
                    for (String word : s.split(" ")) {
                        if (letters.contains(word.substring(0, 1))){
                            out.print(word + " ");
                            wordCount++;
                        }
                    }
                } else out.print("Строка № " + lineCount +": ");
                out.print(" Количество слов: " + wordCount);
                lineCount++;
                out.println();
            }
        } catch (IOException e) {
            System.out.println("Ошибка!"); }
        finally{
            br.close();
            out.flush();
            out.close();
        }
    }
}
