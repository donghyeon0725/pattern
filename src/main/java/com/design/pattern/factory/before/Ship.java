package com.design.pattern.factory.before;

public class Ship {
    private String name;
    private String color;
    private String logo;

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

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}

