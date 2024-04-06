package org.generation.italy.adventure.model;

import java.util.ArrayList;

public class Item {
    private String name;
    private ArrayList <Item> items = new ArrayList<>();

    public Item(String name, ArrayList <Item> items) {
        this.name = name;
        this.items = items;
    }

    public void pick(Item i){
        items.add(i);
    }

    public void drop(Item i){
        items.remove(i);
    }
}
