package org.generation.italy.adventure.model;

import java.util.HashMap;
import java.util.Map;

public class MemoryRoomRepository {

    private static Map <Integer, Room> roomMap = new HashMap<>();

    static{
        
        Room marketPlace = new Room(1, "piazza del mercato", "Sei nella piazza centrale della città dove si svolge un mercato molto vivace",
         new Item(1, "tozzo di pane", "un pezzo di pane mezzo secco", 0.1, 0), 
         new Item(2, "bastone", "bastone di legno", 0.3, 0));
        Room park = new Room(2, "parco", "Sei nel parco, un'area tranquilla piena di uccellini che cinguettano", 
         new Item (3, "topo morto", "un roditore morto da tempo", 0.2, 0));
        Room bakery = new Room(3, "panetteria", "profumo di baguette ti accoglie nella panetteria più chic della città", 
         new Item(4, "baguette", "una fragrante baguette appena sfornata", 0.5, 1));
        Room bookShop = new Room(4, "libreria", "luogo d'incontro di tutti i sapienti della città", 
        new Item(5, "libro", "un libro sulla programmazione java", 2, 2));
        Room restaurnt = new Room(5, "ristorante", "un lussuoso ristorante per i nobili in città", 
        new Item(6, "carbonara", "un bel piatto della cucina tradizionale", 0.5, 3));
        Room museum = new Room(6, "museo", "in questo luogo s'incontra la millenaria storia della città", 
        new Item(7, "mummia", "vescovo mummificato relativamente ben conservato", 50, 100));
        Room arena = new Room(7, "arena", "ampio spazio per allenare le tue capacità di combattimento", 
        new Item(8, "spada", "una spada da quattro soldi", 2, 4));
        roomMap.put(marketPlace.getId(), marketPlace);
        roomMap.put(park.getId(), park);
        roomMap.put(bakery.getId(), bakery);
        roomMap.put(bookShop.getId(), bookShop);
        roomMap.put(restaurnt.getId(), restaurnt);
        roomMap.put(museum.getId(), museum);
        roomMap.put(arena.getId(), arena);

        marketPlace.connect(park, Cardinal.SOUTH);
        marketPlace.connect(bookShop, Cardinal.NORTH);
        marketPlace.connect(restaurnt, Cardinal.EAST);
        marketPlace.connect(museum, Cardinal.WEST);

        museum.connect(arena, Cardinal.WEST);

        park.connect(bakery, Cardinal.EAST);

    }

    public Room getStartRoom(){
        return roomMap.get(1);
    }
}
