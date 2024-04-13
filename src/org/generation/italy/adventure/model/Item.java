package org.generation.italy.adventure.model;

import java.util.Optional;

public class Item {
    private String name;
    private int id;
    private String description;
    private double weight;
    private int value;

    public Item(int id, String name, String description, double weight, int value) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.value = value;
    }
   
    @Override
    public boolean equals(Object other){
        if(other == null){
            return false;
        }
        if(this == other){
            return true;
        }
        if(other.getClass() != this.getClass()){
            return false;
        }
        Item otherItem = (Item) other;
        // if(this.name.equals(otherItem.name)){
        //     return true;
        // }else{
        //     return false;
        // }
        return this.id == otherItem.id;
    }

    @Override
    public int hashCode(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getWeight(){
        return weight;
    }
}
