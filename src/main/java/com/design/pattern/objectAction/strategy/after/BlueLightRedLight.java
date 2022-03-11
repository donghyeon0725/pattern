package com.design.pattern.objectAction.strategy.after;

public class BlueLightRedLight {
    private Strategy strategy;

    public BlueLightRedLight(Strategy strategy) {
        this.strategy = strategy;
    }

    public void blueLight() {
        strategy.blueLight();
    }

    public void redLight() {
        strategy.redLight();
    }
}
