package com.design.pattern.objectAction.observer.after;

public class Client {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("김지훈");
        User user2 = new User("오지게");

        chatServer.subscribe("오징어게임", user1);
        chatServer.subscribe("오징어게임", user2);

        chatServer.subscribe("디자인패턴", user1);

        chatServer.sendMessage(user1, "오징어게임", "안녕하세요");
        chatServer.sendMessage(user2, "디자인패턴", "디자이너");


        chatServer. unsubscribe("오징어게임", user1);
        chatServer.sendMessage(user1, "오징어게임", "안녕하세요");
    }
}
