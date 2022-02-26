package com.design.pattern.objectCreate.abstractFactory.example;

import com.design.pattern.objectCreate.abstractFactory.after.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Ship ship = applicationContext.getBean("whiteship", Ship.class);
        System.out.println(ship.getName());
    }
}
