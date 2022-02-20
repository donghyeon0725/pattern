package com.design.pattern.singleton;

import java.io.Serializable;

public class UserInformation implements Serializable {

    private static UserInformation userInformation1;

    //  기본 생성자에 접근할 수 없도록 막는다.
    private UserInformation() {
    }

    // static 하게 인스턴스를 제공할 수 있도록
    public static UserInformation getInstance() {
        if (userInformation1 == null) {
            userInformation1 = new UserInformation();
        }

        return userInformation1;
    }

    /**
     * synchronized 키워드로 해결
     * */
    public synchronized UserInformation getSynchronizedInstance() {
        if (userInformation1 == null) {
            userInformation1 = new UserInformation();
        }

        return userInformation1;
    }

    /**
     * Eager 로딩으로 해결
     * */
    private static final UserInformation userInformation2 = new UserInformation();
    public UserInformation getEagerInstance() {
        return userInformation2;
    }


    /**
     * double checking synchronized 를 이용하는 방법
     * */
    private static volatile UserInformation userInformation3;
    public UserInformation getDoubleCheckingInstance() {

        if (userInformation3 == null) {
            synchronized (UserInformation.class) {
                if (userInformation3 == null) {
                    userInformation3 = new UserInformation();
                }
            }
        }

        return userInformation3;
    }


    /**
     * inner class 를 이용한 방법
     * */
    private static class UserInformationHolder {
        private static UserInformation userInformation = new UserInformation();
    }
    public UserInformation getInstanceFromHolder() {
        return UserInformationHolder.userInformation;
    }

    /**
     * 역직렬화로 싱글톤이 깨지는 것을 막기 위함
     * */
    public Object readResolve() {
        return getInstance();
    }
}
