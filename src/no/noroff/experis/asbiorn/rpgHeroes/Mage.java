package no.noroff.experis.asbiorn.rpgHeroes;

import no.noroff.experis.asbiorn.rpgHeroes.enums.WeaponType;

public class Mage extends Hero {

    public Mage(String inputName) {
        super(inputName);
        setIntelligence(8);
    }
    enum validWeaponType {
        STAFF,
        WAND,
    }


    public boolean checkValidWeaponTypes(Weapons weaponType) {
        return false;
    }
    @Override
    public boolean checkValidWeaponTypes(String weaponType) {
        return false;
    }

    @Override
    public void increaseAttributes(int numberOfLevels) {
        super.increaseAttributes(numberOfLevels); // any default behavior wanted shared
        setStrength(getStrength()+(1*numberOfLevels));
        setDexterity(getDexterity()+(1*numberOfLevels));
        setIntelligence(getIntelligence()+(5*numberOfLevels));

    }
    public void EquipWeapon(Weapons equipment) throws InvalidWeaponException  //  try catch
    {
        try {
            if (equipment.getRequiredLevel()<=getLevel() ) // check om
            {
                System.out.println("Level Req passed!");
                /// Check for valid weapon types for the mage
                    if (validWeaponType.WAND.name()== equipment.weaponType.name()){
                        System.out.println("success");

                    }
                    //equipment.weaponType==validWeaponTypes){

                if (equipment.getClass() == Weapons.class) {
                    System.out.println(equipment.getClass());
                    System.out.println(Weapons.class);
                    System.out.println("Weapon item on weapon slot");
                } else {
                    throw new InvalidWeaponException("Cannot equip " + equipment.getItemName() + "on Weapons slot");
                }
            }
            else {
                System.out.println("Failed");
                throw new InvalidWeaponException(getHeroName()+"'s level is too low to equip that");
            }
        }
         catch (InvalidWeaponException e) {
            e.printStackTrace();
        }

    }



}
