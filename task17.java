package LABA11;


import java.util.Random;

public class task17 {
    static Random rand = new Random();
    private static int index = 0;
    public static void main(String[] args) {
        int[] massive = new int[10];
        massive = inputArray(massive);
        outputArray(massive);
        System.out.println();
        massive = inputArray(massive);
        outputArray(massive);


    }
    public static int[] inputArray(int[] arr){ // Метод для заполнения массива случайными числами
        if (index == arr.length){
            index = 0;
            return arr;
        }
        arr[index] = rand.nextInt(100);
        index++;
        return inputArray(arr);

    }
    public static int [] outputArray(int[] arr){ //Метод для вывода элементов массива
        if (index == arr.length) {
            index = 0;
            return arr;
        }
        else {
            System.out.println("[" + index + "]= " + arr[index]);
            index++;
            return outputArray(arr);
        }


    }
}



