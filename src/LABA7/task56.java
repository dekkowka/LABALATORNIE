package LABA7;

public class task56 {

    public static void main(String[] args) {
        System.out.println("\nTest 0: \n");
        Super one = new Super("test00000");
        System.out.println(one.toString());

        System.out.println("\n Test 2: \n");
        SubSuper one2 = new SubSuper("2323_2323");
        System.out.println(one2.toString());

        System.out.println("\n Test 3: \n");
        SubSuper one3 = new SubSuper("sdsdsd4", "dssds");
        System.out.println(one3.toString());

    }

}

class Super {
    private String key;

    public void set(String a) {
        this.key = a;
    }

    public String get() {
        return this.key;
    }

    Super(String a) {
        this.key = a;
    }

    Super() {

    }

    @Override
    public String toString() {
        String get = "Name = " + this.getClass().getSimpleName() + "; key = " + get();
        return get;
    }
}

class SubSuper extends Super {

    private String key2;

    SubSuper(String a) {
        super.set(a);
    }

    SubSuper(String a, String b) {
        super.set(a);
        this.key2 = b;
    }

    @Override
    public String toString() {
        String get = "Name = " + this.getClass().getSimpleName() + "; key = " + get() + "; key2 = " + this.key2;
        return get;
    }

}
