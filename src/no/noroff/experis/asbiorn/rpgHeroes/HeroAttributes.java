package no.noroff.experis.asbiorn.rpgHeroes;

public class HeroAttributes {

    ////// ATTRIBUTES
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
    ////// Setters
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    ////// constructor
    HeroAttributes() {
        setStrength(0);
        setDexterity(0);
        setIntelligence(0);
    }
    HeroAttributes(int str, int dex, int intl) {
        setStrength(str);
        setDexterity(dex);
        setIntelligence(intl);
    }

    public void increaseAttributes(int numberOfLevels) { //overwritten in subclasses ...
        System.out.println("leveled Up by " + numberOfLevels+"!");
    }

    public void addInstances(HeroAttributes intrinsicHeroAttributes, HeroAttributes imbue) {
        this.setIntelligence(intrinsicHeroAttributes.getIntelligence() + imbue.getIntelligence());
        this.setStrength(intrinsicHeroAttributes.getStrength() + imbue.getStrength());
        this.setDexterity(intrinsicHeroAttributes.getDexterity() + imbue.getDexterity());

    }
    public void removeInstances(HeroAttributes intrinsicHeroAttributes, HeroAttributes imbue) {
        this.setIntelligence(intrinsicHeroAttributes.getIntelligence() - imbue.getIntelligence());
        this.setStrength(intrinsicHeroAttributes.getStrength() - imbue.getStrength());
        this.setDexterity(intrinsicHeroAttributes.getDexterity() - imbue.getDexterity());


    }

}
