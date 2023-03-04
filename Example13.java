package LR9;

public class Example13 {
    public static void main(String[] args) {
        try{
            int i = args.length;
            System.out.println("Размер массива = "+ i);
            int h = 10/i;
            args[i+1] = "10";
        }
        catch (ArithmeticException e)
        {
            System.out.println("Деление на ноль");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Индекс не существует");
        }
    }
}
