package org.generation.italy.adventure.model;

import java.util.HashMap;
import java.util.Map;

public class RoomRepository {

    private static HashMap <Room, Map<Cardinal, Room>> roomMap = new HashMap<>();

    static{
        


        String descMP = "Prova descrizione";
        Room marketPlace = new Room("marketPlace", descMP, null);
        Room park = new Room(null, null, null);
        Room bakery = new Room(null, null, null);
        Room bookShop = new Room(null, null, null);
        Room restaurnt = new Room(null, null, null);
        Room museum = new Room(null, null, null);
        Room cafe = new Room(null, null, null);

        Map <Cardinal, Room> exitMP = new HashMap<>();
        exitMP.put(Cardinal.EST, cafe);
        exitMP.put(Cardinal.SUD, restaurnt);
        exitMP.put(Cardinal.OVEST, park);
        exitMP.put(Cardinal.NORD, bakery);

        roomMap.put(marketPlace, exitMP);


    }

}
