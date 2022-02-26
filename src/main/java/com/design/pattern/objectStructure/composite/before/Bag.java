package com.design.pattern.objectStructure.composite.before;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
