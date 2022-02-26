package com.design.pattern.objectCreate.abstractFactory.before;

public class Ship {
    private String name;
    private String color;
    private String logo;
    private WhiteAnchor whiteAnchor;
    private WhiteWheel whiteWheel;

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

    public WhiteAnchor getAnchor() {
        return whiteAnchor;
    }

    public Ship setAnchor(WhiteAnchor whiteAnchor) {
        this.whiteAnchor = whiteAnchor;
        return this;
    }

    public WhiteWheel getWheel() {
        return whiteWheel;
    }

    public Ship setWheel(WhiteWheel whiteWheel) {
        this.whiteWheel = whiteWheel;
        return this;
    }
}
