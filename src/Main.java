
import no.noroff.experis.asbiorn.rpgHeroes.*;
import no.noroff.experis.asbiorn.rpgHeroes.enums.WeaponType;

public class Main {

    public static void main(String[] args) throws Exception {
        Mage mageHero = new Mage("Asbiorn");
        mageHero.levelUp(1);

        Weapons testKnife = new Weapons("knife",2, WeaponType.DAGGER);
        Weapons pencil = new Weapons("knife",2, WeaponType.WAND);
        mageHero.EquipWeapon(testKnife);


        System.out.println(testKnife.itemName + testKnife.getRequiredLevel()+ testKnife.getSlot());

        System.out.println(mageHero.checkValidWeaponTypes("staff"));

//        Warrior warriorHero = new Warrior("Thor");
//        System.out.println(warriorHero.display());
//        warriorHero.levelUp(1);
//        System.out.println(warriorHero.display());













    }
}