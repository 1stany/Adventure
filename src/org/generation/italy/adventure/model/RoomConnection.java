package org.generation.italy.adventure.model;

import java.util.Optional;

public class RoomConnection {
    private int id;
    private Room exitAtNorth;
    private Room exitAtSouth;
    private Room exitAtWest;
    private Room exitAtEast;
    private Room source;

    public RoomConnection(){}

    public RoomConnection(int id, Room exitAtNorth, Room exitAtSouth, Room exitAtWest, Room exitAtEast, Room source){
        this.id = id;
        this.exitAtNorth = exitAtNorth;
        this.exitAtSouth = exitAtSouth;
        this.exitAtWest = exitAtWest;
        this.exitAtEast = exitAtEast;
        this.source = source;
    }

    public Optional<Room> getRoomAt(Cardinal c){
        return switch(c){
            case NORTH -> exitAtNorth != null ? Optional.of(exitAtNorth) : Optional.empty();
            case SOUTH -> exitAtSouth != null ? Optional.of(exitAtSouth) : Optional.empty();
            case EAST -> exitAtEast != null ? Optional.of(exitAtEast) : Optional.empty();
            case WEST -> exitAtWest != null ? Optional.of(exitAtWest) : Optional.empty();
        };
    }

    public boolean connectAt(Cardinal c, Room destination){
        switch(c){
            case NORTH : 
                exitAtNorth = destination; 
                break;
            case SOUTH : 
                exitAtSouth = destination;
                break;
            case EAST : 
                exitAtEast = destination;
                break;
            case WEST : 
                exitAtWest = destination;
                break;
        }
        return true;
    }


}
