package com.design.pattern.objectStructure.bridge.after;

public abstract class DefaultChampion implements Champion {

    private String name;

    private Skin skin;

    public DefaultChampion(String name, Skin skin) {
        this.name = name;
        this.skin = skin;
    }

    @Override
    public void move() {
        System.out.printf("%s %s move\n", skin.getName(), this.name);
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s q\n", skin.getName(), this.name);
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s w\n", skin.getName(), this.name);
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s e\n", skin.getName(), this.name);
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s r\n", skin.getName(), this.name);
    }
}
