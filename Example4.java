package LR9;

public class Example4 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Ошибка");
        }
        catch (NullPointerException e )
        {
            System.out.println("1");
        }
        catch (Exception e){
            System.out.println("2");
        }
        catch (Error e){
            System.out.println("3");
        }
        System.out.println("4");
    }
}
