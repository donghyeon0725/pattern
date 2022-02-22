package com.design.pattern.abstractFactory.after;

import org.springframework.beans.factory.FactoryBean;

public class WhiteshipFactory implements ShipFactory, FactoryBean<Ship> {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Ship();

        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());

        return ship;
    }

    @Override
    public Ship getObject() throws Exception {
        return createShip();
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
