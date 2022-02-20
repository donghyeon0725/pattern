package com.design.pattern.factory.before;

public class Client {
    public static void main(String[] args) {
        Ship whiteShip = ShipFactory.orderShip("whiteship", "white@test.com");
        System.out.println(whiteShip);

        Ship blackShip = ShipFactory.orderShip("blackship", "black@test.com");
        System.out.println(blackShip);
    }
}
