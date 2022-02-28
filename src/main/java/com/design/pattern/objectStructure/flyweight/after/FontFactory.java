package com.design.pattern.objectStructure.flyweight.after;

import java.util.HashMap;
import java.util.Map;


public class FontFactory {


    private Map<String, Font> fontCache = new HashMap<>();


    private FontFactory() {
    }

    private static class FactoryHolder {
        private static final FontFactory FONTFACTORY = new FontFactory();
    }

    public static FontFactory getInstance() {
        return FactoryHolder.FONTFACTORY;
    }


    public Font getFont(String name) {

        if (fontCache.containsKey(name)) {
            return fontCache.get(name);
        }

        String[] value = name.split(":");
        Font font = new Font(value[0], Integer.parseInt(value[1]));
        fontCache.put(name, font);

        return font;
    }
}
