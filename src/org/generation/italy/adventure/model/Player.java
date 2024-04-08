package org.generation.italy.adventure.model;


public class Player {
    private String name;
    private Room actualRoom;
    private Inventory inventory;

    public Player(String name, Room actualRoom, Inventory inventory) {
        this.name = name;
        this.actualRoom = actualRoom;
        this.inventory = inventory;
    }  

    


}
