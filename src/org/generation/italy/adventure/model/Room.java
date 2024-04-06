package org.generation.italy.adventure.model;

import java.util.ArrayList;

public class Room {
    private final int MAXEXIT = 4;
    private ArrayList<Item> itemList ;
    private Room roomM [][];
    private String name;
    private String description;
    
    public Room(ArrayList<Item> itemList, Room[][] roomM, String name, String description) {
        this.itemList = new ArrayList<>(itemList);
        this.roomM = roomM;
        this.name = name;
        this.description = description;
    }
    
}
