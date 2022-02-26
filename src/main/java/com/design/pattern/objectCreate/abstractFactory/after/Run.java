package com.design.pattern.objectCreate.abstractFactory.after;

import com.design.pattern.objectCreate.abstractFactory.after.extension.ProshipPartsFactory;

public class Run {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();

        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

        ShipFactory proShipFactory = new WhiteshipFactory(new ProshipPartsFactory());

        Ship proShip = proShipFactory.createShip();

        System.out.println(proShip.getAnchor().getClass());
        System.out.println(proShip.getWheel().getClass());
    }
}
