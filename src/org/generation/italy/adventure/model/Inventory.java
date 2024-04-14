package org.generation.italy.adventure.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Inventory {
    private Map<String, List<Item>> objects = new HashMap<>();

    public Inventory(Item... items) {
        Arrays.stream(items).forEach(this::add);
    }

    public Optional<Item> remove(String objectName) {
        List<Item> items = objects.get(objectName);
        if (items == null) {
            return Optional.empty();
        }
        Item found = items.removeLast();
        if (items.isEmpty()) {
            objects.remove(objectName);
        }
        return Optional.of(found);
    }

    public void add(Item item) {
        var list = objects.getOrDefault(item.getName(), new ArrayList<>());
        list.add(item);
        if(list.size() == 1) {
            objects.put(item.getName(), list);
        }
    }

    public String getItemNameList() {
        return objects.entrySet().stream().map(this::entryToString)
                .collect(Collectors.joining("\n"))
                .stripTrailing();
    }

    private String entryToString(Map.Entry<String, List<Item>> kv) {
        return String.format("%s (%d)", kv.getKey(), kv.getValue().size());
    }
}
