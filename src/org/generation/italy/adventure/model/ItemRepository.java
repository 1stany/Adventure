package org.generation.italy.adventure.model;

import java.util.ArrayList;

public class ItemRepository {

    private static ArrayList <Item> itemRepoMarket = new ArrayList();


    static{
        Item i1 = new Item("latte");
        Item i2 = new Item("uova");
        Item i3 = new Item("mela");
        itemRepoMarket.add(i1);
        itemRepoMarket.add(i2);
        itemRepoMarket.add(i3);

    }
}
