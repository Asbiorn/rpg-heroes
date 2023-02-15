package no.noroff.experis.asbiorn.rpgHeroes;

public class Warrior extends Hero {

    public Warrior(String inputName) {
        super(inputName);
        setStrength(5);
        setDexterity(2);
    }

    @Override
    public void increaseAttributes(int numberOfLevels) {
        super.increaseAttributes(numberOfLevels);
        setStrength(getStrength()+( 3 *numberOfLevels));
        setDexterity(getDexterity()+( 2 *numberOfLevels));
        setIntelligence(getIntelligence()+( 1 *numberOfLevels));
    }
}