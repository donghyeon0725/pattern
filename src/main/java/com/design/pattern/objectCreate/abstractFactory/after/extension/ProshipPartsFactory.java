package com.design.pattern.objectCreate.abstractFactory.after.extension;

import com.design.pattern.objectCreate.abstractFactory.after.Anchor;
import com.design.pattern.objectCreate.abstractFactory.after.ShipPartsFactory;
import com.design.pattern.objectCreate.abstractFactory.after.Wheel;

public class ProshipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new ProAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new ProWheel();
    }
}
