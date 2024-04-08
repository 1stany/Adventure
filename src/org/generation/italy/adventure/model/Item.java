package org.generation.italy.adventure.model;

import java.util.Optional;

public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
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
        return this.name.equals(otherItem.name);
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

    public Optional<String> getName(){
        if(name == null){
            return Optional.empty();
        }
        return Optional.of(name);
    }
}
