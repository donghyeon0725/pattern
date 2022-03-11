package com.design.pattern.objectAction.strategy.after;

public class Faster implements Strategy {
    @Override
    public void blueLight() {
        System.out.println("무궁홖이");
    }

    @Override
    public void redLight() {
        System.out.println("피었슴돠");
    }
}
