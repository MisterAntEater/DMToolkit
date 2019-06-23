package com.example.dmtools;

public class Creature {
    private int HP;
    private int AC;
    private int initiative;

    public Creature( int HP, int AC, int initiative ) {
        this.HP = HP;
        this.AC = AC;
        this.initiative = initiative;
    }

    public int getHP() {
        return this.HP;
    }

    public int getAC() {
        return this.AC;
    }

    public int getInitiative() {
        return this.initiative;
    }

    public void setHP( int HP ) {
        this.HP = HP;
    }

    public void setAC( int AC ) {
        this.AC = AC;
    }

    public void setInitiative( int initiative ) {
        this.initiative = initiative;
    }
}
