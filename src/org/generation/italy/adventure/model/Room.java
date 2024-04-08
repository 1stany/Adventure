package org.generation.italy.adventure.model;

import java.util.HashMap;

public class Room {
    private String name;
    private String description;
    private Inventory inventory ;
    private HashMap <Cardinal, Room> exits = new HashMap<>();
    
    public Room(String name, String description, Inventory inventory) {
        this.name = name;
        this.description = description;
        this.inventory = inventory;
    }

    public boolean connect(Room other, Cardinal direction){
        if(hasBusyExit(direction) || other.hasBusyExit(direction.opposite())){
            return false;
        }else{
            exits.put(direction, other);
            other.exits.put(direction.opposite(), this);
            return true;
        }
    }
    
    public boolean hasBusyExit(Cardinal direction){
        return exits.containsKey(direction);
    }
}
