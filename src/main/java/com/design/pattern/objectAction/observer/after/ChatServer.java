package com.design.pattern.objectAction.observer.after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {
    private Map<String, List<Observer>> observers = new HashMap<>();

    public void subscribe(String subject, Observer observer) {

        if (!observers.containsKey(subject)) {
            observers.put(subject, new ArrayList<>());
        }

        List<Observer> list = observers.get(subject);
        if (!list.contains(subject)) {
            list.add(observer);
        }
    }

    public void unsubscribe(String subject, Observer observer) {
        if (observers.containsKey(subject)) {
            observers.get(subject).remove(observer);
        }
    }

    public void sendMessage(User user, String subject, String message) {
        if (this.observers.containsKey(subject)) {
            String userMessage = "from " + user.getName() + ": " + message;
            this.notify(subject, userMessage);
        }
    }

    public void notify(String subject, String message) {
        this.observers.get(subject).forEach(s -> s.handleMessage(message));
    }

}
