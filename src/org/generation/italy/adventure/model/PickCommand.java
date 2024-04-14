package org.generation.italy.adventure.model;

public class PickCommand implements Command{

  private Player player;
  private String objectName;
  
  public PickCommand(Player player, String objectName) {
    this.player = player;
    this.objectName = objectName;
  }

  @Override
  public String execute() {
    if (player.pick(objectName)) {
      return String.format("Hai preso %s", objectName);
    } else {
      return String.format("Non vedi %s qui...", objectName);
    }
  }
}
