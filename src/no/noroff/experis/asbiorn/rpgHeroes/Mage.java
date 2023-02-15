package no.noroff.experis.asbiorn.rpgHeroes;

public class Mage extends Hero {

    public Mage(String inputName) {
        super(inputName);
        setIntelligence(8);
    }
    @Override
    public void increaseAttributes(int numberOfLevels) {
        super.increaseAttributes(numberOfLevels); // any default behavior wanted shared
        setStrength(getStrength()+(1*numberOfLevels));
        setDexterity(getDexterity()+(1*numberOfLevels));
        setIntelligence(getIntelligence()+(5*numberOfLevels));

    }



}
