package LABA8;

import java.io.*;

public class ex10 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            // Создание потоков
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("C://Users//ES//Desktop//LB8//Exam//ex10//MyFile1.txt"),
                    "cp1251"));
            out = new PrintWriter("C://Users//ES//Desktop//B8//Exam//ex10//MyFile2.txt", "cp1251");
            // Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            // br.close();
            out.flush();
            out.close();
        }
    }
}