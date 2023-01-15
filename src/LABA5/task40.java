package LABA5;

public class task40 {
    public static void main(String[] args) {
        Magic spell1 = new Magic();

        spell1.set_spell('Q');
        spell1.get_damage();
        spell1.view_combo();

        Magic spell2 = new Magic();

        spell2.set_spell('W');
        spell2.get_damage();
        spell2.view_combo();
    }

}

class Magic {

    private char spell_combination;

    public void set_spell(char spells) {
        this.spell_combination = spells;
    }

    public int get_damage() {
        int damage = (int) this.spell_combination;
        return damage;
    }

    public void view_combo()

    {
        System.out.println("Буква - " + this.spell_combination + ", код символа - " + this.get_damage());

    }

}
