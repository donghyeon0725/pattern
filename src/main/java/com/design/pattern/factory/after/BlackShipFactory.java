package com.design.pattern.factory.after;

public class BlackShipFactory implements ShipFactory {
    @Override
    public Ship customizing(String name) {
        return new BlackShip(name);
    }
}
