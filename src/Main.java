
import no.noroff.experis.asbiorn.rpgHeroes.Hero;
import no.noroff.experis.asbiorn.rpgHeroes.Mage;
import no.noroff.experis.asbiorn.rpgHeroes.Warrior;

public class Main {

    public static void main(String[] args) {
        Mage mageHero = new Mage("Asbiorn");
        System.out.println(mageHero.display());
        mageHero.levelUp(1);
        System.out.println(mageHero.display());
        mageHero.levelUp(2);
        System.out.println(mageHero.display());
        mageHero.levelUp(3);
        System.out.println(mageHero.display());


        Warrior warriorHero = new Warrior("Thor");
        System.out.println(warriorHero.display());
        warriorHero.levelUp(1);
        System.out.println(warriorHero.display());













    }
}