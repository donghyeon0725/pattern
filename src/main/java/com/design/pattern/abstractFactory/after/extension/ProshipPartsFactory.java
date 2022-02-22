package com.design.pattern.abstractFactory.after.extension;

import com.design.pattern.abstractFactory.after.Anchor;
import com.design.pattern.abstractFactory.after.ShipPartsFactory;
import com.design.pattern.abstractFactory.after.Wheel;

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
