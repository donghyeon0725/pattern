package com.design.pattern.objectAction.strategy.after;

public class ConcreteStrategy1 implements Strategy {
    @Override
    public void blueLight() {
        System.out.println("무 궁 화   꽆   이");
    }

    @Override
    public void redLight() {
        System.out.println("피 었 습 니 다");
    }
}
