package com.design.pattern.factory.after;

public interface ShipFactory {

    // default 를 사용해서 몸체를 가질 수 있다.
    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);

        // 각각의 배 생성시 마다 달라져야 하는 부분 => 구현하지 않고 둔다.
        Ship ship = createShip(name);
        sendEmail(email);

        return ship;
    }

    Ship createShip(String name);

    private void validate(String name, String email) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("배 이름이 필요합니다");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("연락처가 필요합니다");
        }
    }

    private void prepareFor(String name) {
        System.out.println("배를 준비합니다! 이름 : " + name);
    }

    private void sendEmail(String email) {
        System.out.println("이메일을 발송합니다. 연락처 : " + email);
    }
}
