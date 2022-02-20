package com.design.pattern.singleton;

public class UserInformation {

    private static UserInformation userInformation;

    //  기본 생성자에 접근할 수 없도록 막는다.
    private UserInformation() {
    }

    // static 하게 인스턴스를 제공할 수 있도록
    public static UserInformation getInstance() {
        if (userInformation == null) {
            userInformation = new UserInformation();
        }

        return userInformation;
    }

}
