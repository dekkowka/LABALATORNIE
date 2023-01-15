
package LABA8;

import java.io.*;
import java.net.URL;

public class ex2 {
    // Метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); // читает 1 байт
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        try {
            // с потоком связан файл
            InputStream inFile = new FileInputStream("C:/Users/ES/Desktop/LB8/Exam/ex2/ex2.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

            // c потоком связана интернет-страница
            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            // с потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[] { 7, 9, 3, 7, 4 }); // massiv
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();
        } catch (IOException e) {
            System.out.println("Ошибка " + e);
        }

    }

}
