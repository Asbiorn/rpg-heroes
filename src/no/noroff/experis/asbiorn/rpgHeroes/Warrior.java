package no.noroff.experis.asbiorn.rpgHeroes;

import java.util.EnumSet;

public class Warrior extends Hero {

    public Warrior(String inputName) {
        super(inputName);
        setStrength(5);
        setDexterity(2);
    }

    enum validWeaponTypes {
        Staffs,
        Wands,
    }


    public boolean checkValidWeaponTypes(String weaponType) {
        return false;
    };

    @Override
    public void EquipWeapon(Weapons equipment) throws InvalidWeaponException {

    }

    @Override
    public void increaseAttributes(int numberOfLevels) {
        super.increaseAttributes(numberOfLevels);
        setStrength(getStrength()+( 3 *numberOfLevels));
        setDexterity(getDexterity()+( 2 *numberOfLevels));
        setIntelligence(getIntelligence()+( 1 *numberOfLevels));
    }
}