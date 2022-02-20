package com.design.pattern.factory.after;

public class Client {
    public static void main(String[] args) {
        Ship whiteShip = new WhiteShipFactory().orderShip("whiteship", "white@test.com");
        System.out.println(whiteShip);

        // black ship 을 추가할 때 오직 client 코드만 수정해도 된다.
        Ship blackShip = new BlackShipFactory().orderShip("blackship", "black@test.com");
        System.out.println(blackShip);
    }
}
