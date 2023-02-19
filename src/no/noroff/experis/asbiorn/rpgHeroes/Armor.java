package no.noroff.experis.asbiorn.rpgHeroes;

import no.noroff.experis.asbiorn.rpgHeroes.enums.Slot;
import no.noroff.experis.asbiorn.rpgHeroes.enums.ArmorType;


public class Armor extends Items {
    ArmorType armorType;
    HeroAttributes imbue;

    // Constructors
    public Armor(String inputName, int requiredLevel, Slot slot, ArmorType armorType) {
        super(inputName, requiredLevel, slot);
        this.armorType = armorType;
        this.imbue= new HeroAttributes(0,0,0);

    }
    public Armor(String inputName, int requiredLevel, Slot slot, ArmorType armorType,int str, int dex, int intel  ) {
        super(inputName, requiredLevel, slot);
        this.armorType = armorType;
        this.imbue= new HeroAttributes(str,dex,intel);

    }
}
