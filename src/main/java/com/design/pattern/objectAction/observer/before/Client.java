package com.design.pattern.objectAction.observer.before;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User(chatServer);

        user1.sendMessage("디자인패턴","옵저버 패턴");
        user1.sendMessage("롤드컵", "2021");

        User user2 = new User(chatServer);
        System.out.println(user2.getMessage("디자인패턴"));

        user2.sendMessage("디자인패턴", "에제 코드");
        System.out.println(user2.getMessage("디자인패턴"));
    }
}
