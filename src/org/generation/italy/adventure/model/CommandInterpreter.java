package org.generation.italy.adventure.model;

public class CommandInterpreter {
    private Player p;

    public CommandInterpreter(Player p){
        this.p = p;
    }

    public Command commandFor(String input){
        return switch (input){
            case "n", "s", "o", "e" -> new MoveCommand(p, Cardinal.directionFor(input));
            default -> new NoCommand(input);
        };
    }
}
