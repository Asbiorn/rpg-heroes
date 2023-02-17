package no.noroff.experis.asbiorn.rpgHeroes;

import no.noroff.experis.asbiorn.rpgHeroes.enums.Slot;
import no.noroff.experis.asbiorn.rpgHeroes.enums.WeaponType;


public class Weapons extends Items {
    WeaponType weaponType;
    //only missing weapon damage

    // Constructor
    public Weapons(String inputName, int requiredLevel, WeaponType weaponType) {
        super(inputName, requiredLevel, Slot.WEAPON);
        this.weaponType = weaponType;
    }
    }

