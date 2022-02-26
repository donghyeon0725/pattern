package com.design.pattern.objectStructure.composite.after;


import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {
    List<Component> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public List<Component> getItems() {
        return items;
    }

    @Override
    public int getPrice() {
        return items.stream().mapToInt(Component::getPrice).sum();
    }
}
