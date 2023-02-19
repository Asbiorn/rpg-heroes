
import no.noroff.experis.asbiorn.rpgHeroes.*;
import no.noroff.experis.asbiorn.rpgHeroes.enums.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Mage mageHero = new Mage("Asbiorn");
        mageHero.levelUp(1);


        Weapons testKnife = new Weapons("knife",2,Slot.WEAPON, WeaponType.WAND);
        mageHero.EquipWeapon(testKnife);
        mageHero.levelUp(3);
        System.out.println(mageHero.display());
        Armor testMail = new Armor("embarrassing armor", 5,Slot.BODY, ArmorType.CLOTH, 1,1,1);
        mageHero.EquipArmor(testMail);
        Armor testMail2 = new Armor("light armor", 5,Slot.BODY, ArmorType.CLOTH, 2,2,2);
        //Armor testHelmet = new Armor("Helmet of the sky", 5,Slot.HEAD, ArmorType.CLOTH);
        mageHero.EquipArmor(testMail2);
//        Weapons testKnife2 = new Weapons("knife",2,Slot.BODY, WeaponType.WAND);
//        mageHero.EquipWeapon(testKnife2);
        System.out.println(mageHero.display());


        System.out.println(testKnife.itemName + testKnife.getRequiredLevel()+ testKnife.getSlot());

        System.out.println(mageHero.checkValidWeaponTypes("staff"));

//        Warrior warriorHero = new Warrior("Thor");
//        System.out.println(warriorHero.display());
//        warriorHero.levelUp(1);
//        System.out.println(warriorHero.display());













    }
}