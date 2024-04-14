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

    public boolean pick(String objectName) {
      var opt = actualRoom.remove(objectName);
      if (opt.isEmpty()){
        return false;
      }
      inventory.add(opt.get());
      return true;
    }

    public boolean drop(String objectName) {
      var opt = inventory.remove(objectName);
      if(opt.isEmpty()) {
        return false;
      }
      actualRoom.addObject(opt.get());
      return true;
    }

    public String getInventoryList() {
        return inventory.getItemNameList();
    }
}
