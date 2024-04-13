package org.generation.italy.adventure.model;

public class NoCommand implements Command{
    private String command;

    public NoCommand(String command){
        this.command = command;
    }

    @Override
    public String execute() {
        return String.format("il comando %s non esiste", command);
    }


}
