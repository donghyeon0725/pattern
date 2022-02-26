package com.design.pattern.objectCreate.factory.before;

public class ShipFactory {
    public static Ship orderShip(String name, String email) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("배 이름이 필요합니다");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("연락처가 필요합니다");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        // 구체적인 내용 커스텀 1
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("!!!!");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("****");
        }


        // 구체적인 내용 커스텀 2
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setColor("white");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setColor("black");
        }

        sendEmail(email);

        return ship;
    }

    public static void prepareFor(String name) {
        System.out.println("배를 준비합니다! 이름 : " + name);
    }

    public static void sendEmail(String email) {
        System.out.println("이메일을 발송합니다. 연락처 : " + email);
    }

}
