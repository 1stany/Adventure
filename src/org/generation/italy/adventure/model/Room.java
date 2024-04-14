package org.generation.italy.adventure.model;

import java.util.Arrays;
import java.util.Optional;
import java.util.StringJoiner;

public class Room {
    private int id;
    private String name;
    private String description;
    private Inventory inventory ;
    private RoomConnection connection;
    
    public Room(int id, String name, String description, Item... objects) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.inventory = new Inventory(objects);
        this.connection = new RoomConnection();
    }

    public boolean connect(Room other, Cardinal direction){
        if(isBusyAt(direction) || other.isBusyAt(direction.opposite())){
            return false;
        }else{
            connection.connectAt(direction, other);
            other.connection.connectAt(direction.opposite(), this);
            return true;
        }
    }
    
    public Optional<Item> remove(String objectName) {
        return inventory.remove(objectName);
    }

    public void addObject(Item item) {
        inventory.add(item);
    }

    public Optional<Room> exitAt(Cardinal direction){
        return connection.getRoomAt(direction);
    }

    public boolean hasExitAt(Cardinal direction) {
       return exitAt(direction).isPresent();
    }

    public boolean isBusyAt(Cardinal direction){
        return connection.getRoomAt(direction).isPresent();
    }

    @Override
    public String toString (){
        return """
                                    %s 
               %s
               %s         
                """.stripTrailing().formatted(name, description, getExitDescription());
    }

    private String getExitDescription() {
        StringJoiner sj = new StringJoiner(", ", "[" , "]");
        Arrays.stream(Cardinal.values())
                     .filter(this::hasExitAt)
                     .map(Cardinal::toLetter)
                     .forEach(s -> sj.add(s));
        return sj.toString();
    }

    public String getRoomContent(){
        StringBuilder s = new StringBuilder("In questa stanza vedi: ");
        s.append("\n");
        s.append(inventory.getItemNameList());
        return s.toString();
    }

    public int getId() {
        return id;
    }
}
