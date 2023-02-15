package no.noroff.experis.asbiorn.rpgHeroes;

public class Mage extends Hero {

    public Mage(String inputName) {
        super(inputName);
        this.strength = 1;
        this.dexterity = 1 ;
        this.intelligence = 8 ;
    }
    public void increaseAttributes(int level) {
        this.strength+=(1*level);
        this.dexterity+=(1*level);
        this.intelligence+=(5*level);
    }

}
