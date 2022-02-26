package com.design.pattern.objectCreate.abstractFactory.before;

public class DefaultShipFactory {

    public Ship createShip() {
        Ship ship = new Whiteship();

        return ship;
    }
}
