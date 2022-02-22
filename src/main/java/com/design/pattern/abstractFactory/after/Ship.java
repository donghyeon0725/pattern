package com.design.pattern.abstractFactory.after;

public class Ship {
    private String name;
    private String color;
    private String logo;
    private Anchor anchor;
    private Wheel wheel;

    public String getName() {
        return name;
    }

    public Ship setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Ship setColor(String color) {
        this.color = color;
        return this;
    }

    public String getLogo() {
        return logo;
    }

    public Ship setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public Anchor getAnchor() {
        return anchor;
    }

    public Ship setAnchor(Anchor anchor) {
        this.anchor = anchor;
        return this;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Ship setWheel(Wheel wheel) {
        this.wheel = wheel;
        return this;
    }
}
