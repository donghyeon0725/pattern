package com.design.pattern.abstractFactory.after;


/**
 * 이 자체가 추상 팩토리가 된다.
 *
 * 부품 생성을 위한 클래스 만듬
 * */
public interface ShipPartsFactory {
    Anchor createAnchor();

    Wheel createWheel();
}
