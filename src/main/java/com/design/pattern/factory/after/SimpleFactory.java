package com.design.pattern.factory.after;

public class SimpleFactory implements ShipFactory {
    @Override
    public Ship createShip(String name) {
        if ("whiteship".equalsIgnoreCase(name)) {
            return new WhiteShip(name);
        } else if ("blackship".equalsIgnoreCase(name)) {
            return new BlackShip(name);
        }

        throw new IllegalArgumentException("없습니다!");
    }
}
