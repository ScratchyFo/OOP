package OOP.sem1;

public class Sniper extends Hero {

    public Sniper(String nameHero) {
        super(75,
                75,
                2,
                new int[]{10, 15}, nameHero);
    }
    int rangeMaxDamage;

    @Override
    public String toString() {
        return ("Снайпер: " + nameHero + " здоровье: " + health + "/" + healthMax + " броня: " + armor);
    }

}