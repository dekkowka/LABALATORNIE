package LABA7;

public class task57 {
    public static void main(String[] args) {
        System.out.println("\nTest 0: \n");
        superMan one = new superMan("K");
        one.check();
        one.metod("Ka");
        one.check();
        one.metod();
        one.check();

        System.out.println("\n Test 2: \n");
        superGirl one2 = new superGirl("Kad", 242);
        one2.check();
        one2.metod2();
        one2.check();
        one2.metod2("Kadzima");
        one2.check();
        one2.metod2(444);
        one2.check();
        one2.metod2("Geniy", 5);
        one2.check();

    }

}

class superMan {
    private String ulta;

    public void metod() {

    }

    public void metod(String a) {
        this.ulta = a;
    }

    superMan(String ulta) {
        metod(ulta);
    }

    public int rez() {

        return this.ulta.length();

    }

    public void check() {
        System.out.println(
                "Name = " + this.getClass().getSimpleName() + "; string= " + this.ulta + "; length = " + this.rez());
    }

    public String getUlta() {
        return this.ulta;
    }

}

class superGirl extends superMan {
    int beauty;

    public void metod2() {
        super.metod();
    }

    public void metod2(String a) {
        super.metod(a);
    }

    public void metod2(int a) {
        this.beauty = a;

    }

    public void metod2(String a, int b) {
        this.beauty = b;
        super.metod(a);

    }

    superGirl(String a, int b) {
        super(a);
        this.beauty = b;
    }

    public void check() {
        System.out.println("Name = " + this.getClass().getSimpleName() + "; string= " + super.getUlta() + "; lenght = "
                + super.rez() + "; int = " + this.beauty);

    }

}