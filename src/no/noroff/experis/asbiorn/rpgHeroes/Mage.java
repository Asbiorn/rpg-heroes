package no.noroff.experis.asbiorn.rpgHeroes;


import no.noroff.experis.asbiorn.rpgHeroes.enums.ArmorType;
import no.noroff.experis.asbiorn.rpgHeroes.enums.Slot;
import no.noroff.experis.asbiorn.rpgHeroes.enums.WeaponType;

import java.util.*;

public class Mage extends Hero {

    EnumSet<WeaponType> validWeaponType = EnumSet.of(WeaponType.WAND, WeaponType.STAFF);
    EnumSet<ArmorType> validArmorType = EnumSet.of(ArmorType.CLOTH);


    public Mage(String inputName) {
        super(inputName);
        setIntelligence(8);

        System.out.println("is axe valid?" + validWeaponType.contains(WeaponType.AXE));
        System.out.println("is wand valid?" + validWeaponType.contains(WeaponType.WAND));

        setValidWeaponType(validWeaponType);
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
        super.increaseAttributes(numberOfLevels); // any default behavior wanted shared
        setStrength(getStrength()+(1*numberOfLevels));
        setDexterity(getDexterity()+(1*numberOfLevels));
        setIntelligence(getIntelligence()+(5*numberOfLevels));

    }
    public void EquipWeapon(Weapons equipment) throws InvalidWeaponException
    {
        try {
            if (equipment.getRequiredLevel()<=getLevel() ) // check om
            {
                System.out.println("Level Req passed!");
                /// Check for valid weapon types for the mage
                    if (validWeaponType.contains(equipment.weaponType)){
                        super.EquipmentSlots.put(equipment.slot, equipment);
                        System.out.println("success");
                        System.out.println(EquipmentSlots);
                        displayEquipment();
                    }

                if (equipment.getClass() == Weapons.class) { // check it's not armor
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
    public void EquipArmor(Armor equipment) throws InvalidArmorException {
        {
            try {
                if (equipment.getRequiredLevel()<=getLevel() ) // check om
                {
                    System.out.println("Level Req passed!");
                    /// Check for valid weapon types for the mage
                    if (validArmorType.contains(equipment.armorType)){
                        super.EquipmentSlots.put(equipment.slot, equipment); // should be acceces through class method?
                        System.out.println("success");
                        System.out.println(EquipmentSlots);
                        displayEquipment();
                    }

                    if (equipment.getClass() == Armor.class) { // check it's not armor
                        System.out.println("Armor item on Armor slot");
                    } else {
                        throw new InvalidWeaponException("Cannot equip " + equipment.getItemName() + "on Armor slot");
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


}
