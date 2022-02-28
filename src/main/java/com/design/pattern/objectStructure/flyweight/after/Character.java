package com.design.pattern.objectStructure.flyweight.after;

public class Character {
    private char value;
    private String color;
    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }

    public char getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    public String getFontFamily() {
        return font.getFont();
    }

    public int getFontSize() {
        return font.getSize();
    }
}
