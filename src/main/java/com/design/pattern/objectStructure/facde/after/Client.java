package com.design.pattern.objectStructure.facde.after;

public class Client {

    public static void main(String[] args) {
        EmailSettings settings = new EmailSettings();
        settings.setHost("127.0.0.1");

        EmailSender sender = new EmailSender(settings);

        EmailMessage message = new EmailMessage();
        message.setTo("test@test.com");
        message.setFrom("newTest@test.com");
        message.setText("text");
        message.setSubject("test mail from java program");

        sender.sendEmail(message);
    }
}
