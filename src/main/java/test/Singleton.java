package test;

import com.design.pattern.singleton.UserInformation;

public class Singleton {

    public static void main(String[] args) {
        UserInformation userInformation1 = UserInformation.getInstance();

        UserInformation userInformation2 = UserInformation.getInstance();

        System.out.println(userInformation1 == userInformation2);
    }
}
