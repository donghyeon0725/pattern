package com.design.pattern.objectStructure.flyweight.after;

public final class Font {
    private String font;
    private int size;

    public Font(String font, int size) {
        this.font = font;
        this.size = size;
    }

    public String getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }
}
