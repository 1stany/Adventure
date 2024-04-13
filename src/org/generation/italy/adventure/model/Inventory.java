package org.generation.italy.adventure.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inventory {
    private List<Item> itemList;

    public Inventory(Item... items){
        itemList = new ArrayList<>(Arrays.asList(items));
    }
    
    public Inventory() {
        this.itemList = new ArrayList<>();
    }

    public List<Item> getInventory(){
        return itemList;
    }

    public void pick(Item i){
        itemList.add(i);
    }

    public void drop(Item i){
        itemList.remove(i);
    }

    public String getItemNameList(){
        StringBuilder sb = new StringBuilder();
        for (Item item : itemList) {
            sb.append(item.getName()).append("\n");
        }
        return sb.toString();
    }
}
