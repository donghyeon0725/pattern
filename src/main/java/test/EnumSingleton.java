package test;

import com.design.pattern.singleton.Settings;
import com.design.pattern.singleton.UserInformation;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumSingleton {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, IOException, ClassNotFoundException {
        Settings settings1 = Settings.INSTANCE;
        Settings settings2 = Settings.INSTANCE;
        Settings settings3 = null;

        System.out.println(settings1 == settings2); // true



        // 직렬화, 역질렬화를 사용해서 깨뜨리기
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("userInformation.obj"))) {
            out.writeObject(settings1);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("userInformation.obj"))) {
            settings3 = (Settings) in.readObject();
        }


        System.out.println(settings1 == settings3); // true

        Settings.INSTANCE.setValue(7);
        System.out.println(Settings.INSTANCE.getValue()); // 7


        // 리플랙션 접근 불가능
        Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors();

        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            settings3 = (Settings) constructor.newInstance("INSTANCE");
        }

        System.out.println(settings1 == settings3); // Cannot reflectively create enum objects



    }
}
