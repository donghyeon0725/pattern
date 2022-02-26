package com.design.pattern.objectCreate.factory.after;

public class BlackShipFactory implements ShipFactory {
    @Override
    public Ship createShip(String name) {
        return new BlackShip(name);
    }
}
