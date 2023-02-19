package no.noroff.experis.asbiorn.rpgHeroes;

import no.noroff.experis.asbiorn.rpgHeroes.enums.ArmorType;
import no.noroff.experis.asbiorn.rpgHeroes.enums.Slot;
import no.noroff.experis.asbiorn.rpgHeroes.enums.WeaponType;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;


public abstract class Hero extends HeroAttributes {
    /// ATTRIBUTES
    private String heroName;
    private Integer level;

    static HashMap<Slot, Items> EquipmentSlots;

    public EnumSet<ArmorType> validArmorType;
    public EnumSet<WeaponType> validWeaponType;

    //protected hashMap EquipmentSlots { // hashmap of weapons <Items>?


    // CONSTRUCTOR
    Hero(String inputName){
       setHeroName(inputName);
       this.level=1;

        EquipmentSlots = new HashMap<Slot, Items>();
        for (Slot slot : Slot.values()) {
            EquipmentSlots.put(slot, null);

        }


    }
/// GETTERS
    public String getHeroName() {
        return heroName;
    }
    public Integer getLevel() {
        return level;
    }

///// Setters
    public void setHeroName(String inputName) {
        this.heroName = inputName;
    }
    public void levelUp(Integer level) { //setter
        this.level +=level;
        increaseAttributes(level);
    }



// public shared fields:
    public abstract boolean checkValidWeaponTypes(String weaponType); // nu er jeg ved at lave dette til en method.. måske ok?

    //public abstract void ValidArmorTypes();
    //public abstract void Equipment(); //
    // try to equip an item, it is valid and levlreq checks okay, attach it on the hashSet?

   /// "DEFAULT" METHODS
 //  public void increaseAttributes(int level) {}; // could be in interface?

    public boolean checkLevelRequirement(Items item, Hero hero) {
        return item.getRequiredLevel() <= hero.getLevel();
    };

    public void EquipArmor(Armor equipment) throws InvalidArmorException {
        {
            try {
                if (!checkLevelRequirement(equipment,this) ) {
                    throw new InvalidArmorException(getHeroName() + "'s level is too low to equip that");
                }
                if (!(equipment.getClass() == Armor.class)) { // maybe not specified in assignment
                    throw new InvalidArmorException("Cannot equip " + equipment.getItemName() + "on Armor slot");
                }
                if (!this.validArmorType.contains(equipment.armorType)) {
                    throw new InvalidArmorException("cannot Equip " + equipment.armorType + " type of armor");
                }
                if (!(EquipmentSlots.get(equipment.slot)==null)) {
                    Armor oldItemImbue = (Armor) EquipmentSlots.get(equipment.slot);
                    EquipmentSlots.replace(equipment.slot,equipment);
                    this.removeInstances(this,oldItemImbue.imbue);

                }
                EquipmentSlots.put(equipment.slot, equipment);
                this.addInstances(this,equipment.imbue);
                System.out.println("Armor equip success");
                System.out.println(display());

            }
            catch (InvalidArmorException e) {
                e.printStackTrace();
            }

        }

    }

    public void EquipWeapon(Weapons equipment) throws InvalidWeaponException {
        {
            try {
                if (!checkLevelRequirement(equipment,this) ) {
                    throw new InvalidWeaponException(getHeroName() + "'s level is too low to equip that");
                }
                if (!(equipment.getClass() == Weapons.class)) { // maybe not specified in assignment
                    throw new InvalidWeaponException("Cannot equip " + equipment.getItemName() + "on Weapon slot");
                }
                if (!this.validWeaponType.contains(equipment.weaponType)) {
                    throw new InvalidWeaponException("cannot Equip " + equipment.weaponType + " type of weapon");
                }
                EquipmentSlots.put(equipment.slot, equipment);
                displayEquipment();

            }
            catch (InvalidWeaponException e) {
                e.printStackTrace();
            }

        }

    }


    public abstract void setValidWeaponType(EnumSet<WeaponType> validWeaponType);
   // public abstract void EquipWeapon(Weapons equipment) throws InvalidWeaponException ; //  try catch

    public void displayEquipment() {
        for (Map.Entry<Slot,Items> entry : EquipmentSlots.entrySet()) {
            Slot slot = entry.getKey();
            Items item = entry.getValue();
            if (item==null) {
                System.out.println(slot + " : " + item);
            }
            else {
                System.out.println(slot + " : " + item.itemName);
            }
        }
    }

    public StringBuilder display() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ").append(heroName);
        builder.append("\nClass: ").append(this.getClass().getSimpleName());
        builder.append("\nlevel: ").append(this.getLevel());

        builder.append("\nStrength: ").append(this.strength);
        builder.append("\nDexterity: ").append(this.dexterity);
        builder.append("\nIntelligence: ").append(this.intelligence);
        return builder;
    }

}
