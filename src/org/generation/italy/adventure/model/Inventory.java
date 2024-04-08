package org.generation.italy.adventure.model;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> itemList;

    public static void main(String[] args) {
        Inventory x = new Inventory();
        Item i1 = new Item("spada");
        Item i2 = new Item("spada");
        x.pick(i2);
        System.out.println(x.itemList.size());
        x.drop(i1);
        System.out.println(x.itemList.size());
        // boolean result = i1.equals(i2);
        // boolean result2 = i1.equals(i1);
        // boolean result3 = i1.equals("ciao");
    }
    
    public Inventory() {
        this.itemList = new ArrayList<>();
    }

    public ArrayList<Item> getInventory(){
        return itemList;
    }

    public void pick(Item i){
        itemList.add(i);
    }

    public void drop(Item i){
        itemList.remove(i);
    }
}
