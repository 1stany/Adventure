package org.generation.italy.adventure.model;

public class CommandInterpreter {
    private Player p;

    public CommandInterpreter(Player p){
        this.p = p;
    }

    public Command commandFor(String input){
        String[] parts = input.split("\\s+", 2);
        String main = parts[0];
        return switch (main){
            case "n", "s", "o", "e" -> new MoveCommand(p, Cardinal.directionFor(main));
            case "l" -> new LookCommand(p);
            case "i" -> new InventoryCommand(p);
            case "p"-> new PickCommand(p, parts[1]);
            case "d"-> new DropCommand(p, parts[1]);
            default -> new NoCommand(input);
        };
    }
}
