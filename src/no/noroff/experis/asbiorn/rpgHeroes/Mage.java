package no.noroff.experis.asbiorn.rpgHeroes;


import no.noroff.experis.asbiorn.rpgHeroes.enums.ArmorType;
import no.noroff.experis.asbiorn.rpgHeroes.enums.Slot;
import no.noroff.experis.asbiorn.rpgHeroes.enums.WeaponType;

import java.util.*;

public class Mage extends Hero {


    public Mage(String inputName) {
        super(inputName);
        this.setStrength(1);
        this.setDexterity(1);
        this.setIntelligence(8);
       // setValidWeaponType(validWeaponType);


        validArmorType  = EnumSet.of(ArmorType.CLOTH);
        validWeaponType = EnumSet.of(WeaponType.WAND, WeaponType.STAFF);



    }

    @Override
    public void setValidWeaponType(EnumSet<WeaponType> validWeaponType) {
        this.validWeaponType = validWeaponType;
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
        super.increaseAttributes(numberOfLevels); // any default behavior wanted to be shared
        setStrength(getStrength()+(1*numberOfLevels));
        setDexterity(getDexterity()+(1*numberOfLevels));
        setIntelligence(getIntelligence()+(5*numberOfLevels));

    }



}
