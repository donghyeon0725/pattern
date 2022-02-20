package test;

import com.design.pattern.singleton.UserInformation;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, IOException, ClassNotFoundException {
        UserInformation userInformation1 = UserInformation.getInstance();
        UserInformation userInformation2 = UserInformation.getInstance();

        System.out.println(userInformation1 == userInformation2);

        // 리플랙션을 사용해서 깨뜨리기
        Constructor<UserInformation> userInformationConstructor = UserInformation.class.getDeclaredConstructor();
        userInformationConstructor.setAccessible(true);
        UserInformation newUserInformation = userInformationConstructor.newInstance();

        System.out.println(userInformation1 == newUserInformation);

        // 직렬화, 역질렬화를 사용해서 깨뜨리기
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("userInformation.obj"))) {
            out.writeObject(userInformation1);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("userInformation.obj"))) {
            userInformation2 = (UserInformation) in.readObject();
        }

        // true 가 됩니다.
        System.out.println(userInformation1 == userInformation2);

    }
}
