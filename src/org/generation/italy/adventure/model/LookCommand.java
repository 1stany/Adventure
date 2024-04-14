package org.generation.italy.adventure.model;

public class LookCommand implements Command{
  private Player p;
  
  public LookCommand(Player p) {
    this.p = p;
  }

  @Override
  public String execute() {
     return "Dai uno sguardo in giro";
  }

}
