package no.noroff.experis.asbiorn.rpgHeroes;

import no.noroff.experis.asbiorn.rpgHeroes.enums.WeaponType;

import java.util.EnumSet;

public class Warrior extends Hero {

    public Warrior(String inputName) {
        super(inputName);
        setStrength(5);
        setDexterity(2);
    }

    @Override
    public void setValidWeaponType(EnumSet<WeaponType> validWeaponType) {

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