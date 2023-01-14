package LABA7;

public class task58 {
    public static void main(String[] args) {
        System.out.println("\nTest 0: \n");
        oneMaster one = new oneMaster(123);
        System.out.println(one.toString());

        System.out.println("\n Test 2: \n");
        twoMaster one2 = new twoMaster(222, 'I');
        System.out.println(one2.toString());

        System.out.println("\n Test 3: \n");
        threeMaster one3 = new threeMaster(333, 'm', "mr ROBOT");
        System.out.println(one3.toString());

    }
}

class oneMaster {
    public int danger;

    public void change(int a) {
        this.danger = a;
    }

    oneMaster(int a) {
        change(a);
    }

    oneMaster() {
    }

    @Override
    public String toString() {
        String get = "Name = " + this.getClass().getSimpleName() + "; int = " + this.danger;
        return get;
    }
}

class twoMaster extends oneMaster {
    public char u;

    public void change(int a, char b) {
        this.danger = a;
        this.u = b;

    }

    twoMaster(int a, char b) {
        change(a, b);
    }

    twoMaster() {
    }

    @Override
    public String toString() {
        String get = "Name = " + this.getClass().getSimpleName() + "; int = " + this.danger + "; char = " + this.u;
        return get;
    }
}

class threeMaster extends twoMaster {
    public String name;

    public void change(int a, char b, String c) {
        this.danger = a;
        this.u = b;
        this.name = c;

    }

    threeMaster(int a, char b, String c) {
        change(a, b, c);
    }

    @Override
    public String toString() {
        String get = "Name = " + this.getClass().getSimpleName() + "; int = " + this.danger + "; char = " + this.u
                + "; String = " + this.name;
        return get;
    }
}