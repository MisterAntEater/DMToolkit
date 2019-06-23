package com.example.dmtools;

public class Creature {
    private int HP;
    private int AC;
    private int initiative;
    private String status;

    public Creature( int HP, int AC, int initiative, String status ) {
        this.HP = HP;
        this.AC = AC;
        this.initiative = initiative;
        this.status = status;
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
