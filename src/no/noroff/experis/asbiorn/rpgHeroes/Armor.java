package no.noroff.experis.asbiorn.rpgHeroes;

import no.noroff.experis.asbiorn.rpgHeroes.enums.Slot;
import no.noroff.experis.asbiorn.rpgHeroes.enums.ArmorType;


public class Armor extends Items {
    ArmorType armorType;

    // Constructor
    public Armor(String inputName, int requiredLevel, Slot slot, ArmorType armorType) {
        super(inputName, requiredLevel, slot);
        this.armorType = armorType;
    }
}

