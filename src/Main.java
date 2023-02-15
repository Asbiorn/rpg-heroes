
import no.noroff.experis.asbiorn.rpgHeroes.Mage;
import no.noroff.experis.asbiorn.rpgHeroes.Warrior;

public class Main {

    public static void main(String[] args) {
        Mage mageHero = new Mage("Asbiorn");

        System.out.println(mageHero.display());
        mageHero.gainLevel(1);
        System.out.println(mageHero.display());
        Warrior warriorHero = new Warrior("Thor");
        System.out.println(warriorHero.display());
        warriorHero.gainLevel(1);
        System.out.println(warriorHero.display());





    }
}