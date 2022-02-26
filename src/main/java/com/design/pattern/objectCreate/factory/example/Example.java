package com.design.pattern.objectCreate.factory.example;

import com.design.pattern.objectCreate.singleton.Config;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Locale;

public class Example {

    public static void main(String[] args) {
        // calendar
        System.out.println(Calendar.getInstance().getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-Ivariant-TH")).getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-Ivariant-JP")).getClass());

        // spring
        BeanFactory xmlFactory = new ClassPathXmlApplicationContext("config.xml");
        String hello = xmlFactory.getBean("hello", String.class);
        System.out.println(hello); // hello

        BeanFactory javaFactory = new AnnotationConfigApplicationContext(Config.class);
        String helloStr = javaFactory.getBean("helloBean", String.class);
        System.out.println(helloStr); // hello
    }
}
