package no.noroff.experis.asbiorn.rpgHeroes;

public class HeroAttributes {

    /// ATTRIBUTES
    protected int strength;
    protected int dexterity;
    protected int intelligence;

    ////// Getters
    public int getStrength() {
        return strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public int getIntelligence() {
        return intelligence;
    }
    ///// Setters
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    // constructor
    HeroAttributes() {
        setStrength(1);
        setDexterity(1);
        setIntelligence(1);
    } // set all attributes to 1

    public void increaseAttributes(int numberOfLevels) { //overwritten in subclasses ...
        System.out.println("leveled Up by " + numberOfLevels+"!");
    }


}
