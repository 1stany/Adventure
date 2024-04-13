package org.generation.italy.adventure.model;


public class Player {
    private String name;
    private Room actualRoom;
    private Inventory inventory;

    public Player(String name, Room actualRoom, Item... items) {
        this.name = name;
        this.actualRoom = actualRoom;
        this.inventory = new Inventory(items);
    }  

    public Room getActualRoom(){
        return actualRoom;
    }
    
    public String getName(){
        return name;
    }

    public void setCurrentRoom(Room current){
        actualRoom = current;
    }
}
