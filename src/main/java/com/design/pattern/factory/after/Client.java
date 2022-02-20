package com.design.pattern.factory.after;

public class Client {
    public static void main(String[] args) {
        Ship whiteShip = new WhiteShipFactory().orderShip("whiteship", "white@test.com");
        System.out.println(whiteShip);

        // black ship 을 추가할 때 오직 client 코드만 수정해도 된다.
        Ship blackShip = new BlackShipFactory().orderShip("blackship", "black@test.com");
        System.out.println(blackShip);


        // client 가 인터페이스 기반으로 코드를 작성하고 있다고 하면 다음과 같이 코드가 변경되기 때문에 이제는 필요한 코드를 spring 에서 DI로 넣어주면 된다.
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "white@test.com");
        client.print(new BlackShipFactory(), "blackship", "black@test.com");
    }

    public void print(ShipFactory factory, String name, String email) {
        System.out.println(factory.orderShip(name, email));
    }
}
