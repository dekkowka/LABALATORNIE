package LABA8;

import java.io.*;
import java.util.Arrays;

public class ex3 {
    // Считывание по 5 символов (буфер)
    public static void readAllByArray(InputStream in) throws IOException {

        byte[] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if (count != -1) { // если не конец файла
                System.out.println("количество =" + count + ", buff = " + Arrays.toString(buff) + ", str="
                        + new String(buff, 0, count, "cp1251")); // данные буфера преобразовываются в строку //UTF8
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "C:/Users/ES/Desktop/LB8/Exam/ex3/ex3.txt";
        InputStream inFile = null; // переменная объявляется до секции try, чтоб не ограничивать область видимости

        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытия файла" + fileName + e); // корректное закрытие потока
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                    /* NOP */ // No Operation - ничего не делать
                }
            }
        }
    }
}