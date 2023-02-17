
import no.noroff.experis.asbiorn.rpgHeroes.*;
import no.noroff.experis.asbiorn.rpgHeroes.enums.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Mage mageHero = new Mage("Asbiorn");
        mageHero.levelUp(1);

        Weapons testKnife = new Weapons("knife",2,Slot.WEAPON, WeaponType.WAND);
        mageHero.EquipWeapon(testKnife);
        mageHero.levelUp(3);
        Armor testMail = new Armor("gladiator's bane", 5,Slot.BODY, ArmorType.CLOTH);
        mageHero.EquipArmor(testMail);
        Armor testHelmet = new Armor("Helmet of the sky", 5,Slot.HEAD, ArmorType.CLOTH);
        mageHero.EquipArmor(testHelmet);
        Weapons testKnife2 = new Weapons("knife",2,Slot.BODY, WeaponType.WAND);
        mageHero.EquipWeapon(testKnife2);


        System.out.println(testKnife.itemName + testKnife.getRequiredLevel()+ testKnife.getSlot());

        System.out.println(mageHero.checkValidWeaponTypes("staff"));

//        Warrior warriorHero = new Warrior("Thor");
//        System.out.println(warriorHero.display());
//        warriorHero.levelUp(1);
//        System.out.println(warriorHero.display());













    }
}