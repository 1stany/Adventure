package org.generation.italy.adventure.model;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Item> invetory;
    private Room attualRoom;

    public Player(String name, ArrayList<Item> invetory, Room attualRoom) {
        this.name = name;
        this.invetory = invetory;
        this.attualRoom = attualRoom;
    }  

    public void printInventory(){
        System.out.println("Inventario:");
        for (Item item : invetory) {
            System.out.printf("-%s%n", item);
        }
    }


}
