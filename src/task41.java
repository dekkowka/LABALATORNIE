package LABA5;

public class task41 {

    public static void main(String[] args) {
        Magic2 spell3 = new Magic2();
        spell3.view_combo('Q', 'A');
    }

}

class Magic2 {
    private char spell_start;
    private char spell_end;

    public void view_combo(char spell_s, char spell_e) {
        this.spell_start = spell_s;
        this.spell_end = spell_e;

        char swap;
        if ((int) spell_end < (int) spell_start) {
            swap = spell_end;
            spell_end = spell_start;
            spell_start = swap;
        }
        for (int i = (int) spell_start; i <= (int) spell_end; i++)
            System.out.println("Буква - " + (char) i);

    }

}
