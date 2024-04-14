package org.generation.italy.adventure.model;

public class DropCommand implements Command{

  private Player player;
  private String objectName;

  public DropCommand(Player player, String objectName) {
    this.player = player;
    this.objectName = objectName;
  }

  @Override
  public String execute() {
     if(player.drop(objectName)) {
      return String.format("Hai lasciato cadere %s", objectName);
     } else {
      return String.format("Non hai %s da lasciare", objectName);
     }
  }

}
