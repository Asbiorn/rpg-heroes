package no.noroff.experis.asbiorn.rpgHeroes;

import no.noroff.experis.asbiorn.rpgHeroes.enums.Slot;


public abstract class Items {
    /* All items share the following fields:
    • Name
    • RequiredLevel
    • Slot - which they fit in...
    */
    public String itemName;
    private Integer RequiredLevel;
    protected Slot slot;

    Items(String inputName, int requiredLevel, Slot slot) {
        setItemName(inputName);
        setRequiredLevel(requiredLevel);
        setSlot(slot);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getRequiredLevel() {
        return RequiredLevel;
    }

    public void setRequiredLevel(Integer requiredLevel) {
        RequiredLevel = requiredLevel;
    }
    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

}