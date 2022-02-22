package com.design.pattern.abstractFactory.before;

public class DefaultShipFactory {

    public Ship createShip() {
        Ship ship = new Whiteship();

        return ship;
    }
}
