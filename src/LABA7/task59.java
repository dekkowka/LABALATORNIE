package LABA7;

public class task59 {
    public static void main(String[] args) {
        System.out.println("\nTest 0: \n");
        one o = new one('a');
        System.out.println(o.toString());

        System.out.println("\n Test 2: \n");
        one1 o2 = new one1('b', "altay");
        System.out.println(o2.toString());

        System.out.println("\n Test 3: \n");
        one2 o3 = new one2('c', "mr ROBOT", 122);
        System.out.println(o3.toString());

        System.out.println("\nTest 4: \n");
        one a = new one(o);
        System.out.println(a.toString());
        one b = new one1(o2);
        System.out.println(b.toString());
        one c = new one2(o3);
        System.out.println(c.toString());

        System.out.println("\nTest 5: \n");
        one c2 = new one1(o3);
        System.out.println(c2.toString());
        one c3 = new one(o3);
        System.out.println(c3.toString());

    }
}

class one {
    public char bee;

    one(char a) {
        this.bee = a;
    }

    one() {
    }

    public one(one copy) {
        this.bee = copy.bee;
    }

    @Override
    public String toString() {
        String get = "Name = " + this.getClass().getSimpleName() + "; char = " + this.bee;
        return get;
    }

}

class one1 extends one {
    public String honey;

    one1(char a, String b) {
        this.bee = a;
        this.honey = b;
    }

    one1() {
    }

    public one1(one1 copy) {
        this.bee = copy.bee;
        this.honey = copy.honey;
    }

    @Override
    public String toString() {
        String get = "Name = " + this.getClass().getSimpleName() + "; char = " + this.bee + "; String = " + this.honey;
        return get;
    }

}

class one2 extends one1 {
    public int count;

    one2(char a, String b, int c) {
        this.bee = a;
        this.honey = b;
        this.count = c;
    }

    public one2(one2 copy) {
        this.bee = copy.bee;
        this.honey = copy.honey;
        this.count = copy.count;
    }

    @Override
    public String toString() {
        String get = "Name = " + this.getClass().getSimpleName() + "; char = " + this.bee + "; String = " + this.honey
                + "; Count = " + this.count;
        return get;
    }

}