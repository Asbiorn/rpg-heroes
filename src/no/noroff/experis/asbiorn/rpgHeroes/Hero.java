package no.noroff.experis.asbiorn.rpgHeroes;

public abstract class Hero extends HeroAttributes {
    /// ATTRIBUTES
    public String heroName;
    private Integer level;

    /*
     enums virker, men ikke til at kalde en klasse under, tror jeg.  -  MÅske bruge downcasting!!! som i hero(name:asb, Mage)??? men jeg er slet ikke sikker...
    enum heroSubClass {
        Mage,
        Warrior,
    }
    public heroSubClass subClass;

     */ // not part of assginement

// CONSTRUCTOR
    Hero(String inputName){
       setHeroName(inputName);
        this.level= 1;

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

   /// "DEFAULT" METHODS
 //  public void increaseAttributes(int level) {}; // could be in interface?

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
