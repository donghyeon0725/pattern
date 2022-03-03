package com.design.pattern.objectAction.observer.before;

public class User {
    private ChatServer chatServer;

    public User(ChatServer chatServer) {
        this.chatServer = chatServer;
    }

    public void sendMessage(String subject, String message) {
        chatServer.add(subject, message);
    }

    public String getMessage(String subject) {
        return chatServer.get(subject);
    }
}
