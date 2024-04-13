package org.generation.italy.adventure.model;

import java.util.Optional;

public class MoveCommand implements Command{
    private Player player;
    private Cardinal direction;
    
    public MoveCommand(Player player, Cardinal direction){
        this.player = player;
        this.direction = direction;
    }

    @Override
    public String execute() {
        Room c = player.getActualRoom();
        Optional<Room> exit = c.exitAt(direction);
        if(exit.isPresent()){
            player.setCurrentRoom(exit.get());
            return "ti sei mosso a " + direction;
        }
        return "non puoi andare in quella direzione";
    }
    
}
