package no.noroff.experis.asbiorn.rpgHeroes;

public class Warrior extends Hero {

    public Warrior(String inputName) {
        super(inputName);
        this.strength = 5;
        this.dexterity = 2 ;
        this.intelligence = 1 ;

    }
    public void increaseAttributes(int level) {
        this.strength+=(3*level);
        this.dexterity+=(2*level);
        this.intelligence+=(1*level);
    }

}
