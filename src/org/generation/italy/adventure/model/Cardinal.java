package org.generation.italy.adventure.model;

import java.security.InvalidParameterException;

public enum Cardinal {
    NORTH,  SOUTH, EAST, WEST;

    public Cardinal opposite(){
        return switch (this) {
            case EAST -> WEST;
            case WEST -> EAST;
            case NORTH -> SOUTH;
            case SOUTH -> NORTH;
        };
    }

    public static Cardinal directionFor(String command){
        return switch (command) {
            case "e" -> EAST;
            case "o" -> WEST;
            case "s" -> SOUTH;
            case "n" -> NORTH;
            default -> throw new InvalidParameterException(command);
        };
    }

    public String toItalian() {
        return switch (this) {
            case EAST -> "est";
            case WEST -> "ovest";
            case NORTH -> "nord";
            case SOUTH -> "sud";
        };
    }

    public String toLetter(){
        return this.toString().substring(0, 1).toLowerCase();
    }
}
