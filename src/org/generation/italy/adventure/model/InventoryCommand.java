package org.generation.italy.adventure.model;

public class InventoryCommand implements Command{
  private Player p;

  public InventoryCommand(Player p) {
    this.p = p;
  }
  @Override
  public String execute() {
     return p.getInventoryList();
  }

}
