package com.design.pattern.objectStructure.bridge.after;

public class PoolParty implements Skin{

    private String name = "pollParty";

    @Override
    public String getName() {
        return this.name;
    }
}
