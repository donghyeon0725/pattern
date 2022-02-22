package com.design.pattern.abstractFactory.before;


/**
 * Factory 클래스 자체를 클라이언트 코드로 바라보고 구현 시작
 *
 * WhiteAnchor, WhiteWheel 와 같이 구체적인 클래스에 의존하고 있음
 * */
public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
