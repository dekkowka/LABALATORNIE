package LABA7;

public class task60 {
    public static void main(String[] args) {
        System.out.println("\nTest 0: \n");
        Hero God = new Hero("GOD");
        System.out.println(God.toString());

        System.out.println("\n Test 2: \n");
        Angel son = new Angel("Micahel", 999);
        System.out.println(son.toString());

        System.out.println("\n Test 3: \n");
        Demons not_son = new Demons("Lucifer", '(');
        System.out.println(not_son.toString());

        System.out.println("\n Test 4: \n");

        System.out.println(((Angel) son).toString());
        System.out.println(((Demons) not_son).toString());

        System.out.println("\n Test 5: \n");
        God.call_child(son, not_son);

    }
}

class Hero {
    protected String baf;

    public void set(String b) {
        this.baf = b;
    }

    Hero(String b) {
        set(b);
    }

    Hero() {
    }

    @Override
    public String toString() {
        String get = "Name = " + this.getClass().getSimpleName() + "; String = " + this.baf;
        return get;
    }

    public void call_child(Angel son, Demons not_son) {
        System.out.println(((Angel) son).toString());
        System.out.println(((Demons) not_son).toString());
    }

}

class Angel extends Hero {
    protected int skill_damage;

    Angel(String b, int a) {
        this.baf = b;
        this.skill_damage = a;

    }

    @Override
    public String toString() {
        String get = "Name = " + this.getClass().getSimpleName() + "; String = " + this.baf + "; Int = "
                + this.skill_damage;
        return get;
    }

}

class Demons extends Hero {
    protected char combo;

    Demons(String b, char c) {
        this.baf = b;
        this.combo = c;
    }

    @Override
    public String toString() {
        String get = "Name = " + this.getClass().getSimpleName() + "; String = " + this.baf + "; Char = "
                + this.combo;
        return get;
    }

}