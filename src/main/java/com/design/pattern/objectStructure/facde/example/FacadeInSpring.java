package com.design.pattern.objectStructure.facde.example;

import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class FacadeInSpring {
    public static void main(String[] args) {
        MailSender mailSender = new JavaMailSenderImpl();
    }
}
