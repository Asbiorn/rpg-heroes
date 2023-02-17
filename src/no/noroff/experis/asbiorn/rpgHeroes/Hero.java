package no.noroff.experis.asbiorn.rpgHeroes;

import no.noroff.experis.asbiorn.rpgHeroes.enums.Slot;

import java.util.HashMap;


public abstract class Hero extends HeroAttributes {
    /// ATTRIBUTES
    public String heroName;
    private Integer level;

    HashMap<Slot, Items> EquipmentSlots;

    //protected hashMap EquipmentSlots { // hashmap of weapons <Items>?


    // CONSTRUCTOR
    Hero(String inputName){
       setHeroName(inputName);
        this.level= 1;
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


    public abstract void EquipWeapon(Weapons equipment) throws InvalidWeaponException ; //  try catch

    //public abstract void EquipArmor();




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
    /*
     enums virker, men ikke til at kalde en klasse under, tror jeg.  -  MÅske bruge downcasting!!! som i hero(name:asb, Mage)??? men jeg er slet ikke sikker...
    enum heroSubClass {
        Mage,
        Warrior,
    }
    public heroSubClass subClass;

     */ // not part of assginement

    /* Each hero has the following shared fields:
    * Name
    • Level - all heroes start at level 1
    • LevelAttribtues - total from all levels
    • Equipment - holds currently equipped items
    • ValidWeaponTypes – a list of weapon types a hero can equip based on their subclass
    • ValidArmorTypes - a list of armor types a hero can equip based on their subclass

     */

}
