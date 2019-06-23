package com.example.dmtools;

import java.util.ArrayList;

public class Encounter {

    private ArrayList<Creature> creatures;
    private int index;

    public Encounter(ArrayList<Creature> creatures) {
        this.creatures = creatures;
        this.index = 0;
    }

    public Creature getCreatureAtIndex(int index) {
        return creatures.get(index);
    }

    //increments the index rolls over to 0 if we reached the end
    public void incrementIndex() {
        this.index = 1;
        if(index == this.creatures.size()){
            this.index = 0;
        }
    }

    //delete creatures from the list
    public void deleteCreature(int index){
        this.creatures.remove(index);
    }

    public void saveEncounter() {

    }

}
