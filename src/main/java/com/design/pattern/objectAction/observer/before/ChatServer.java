package com.design.pattern.objectAction.observer.before;

import java.util.HashMap;
import java.util.Map;

public class ChatServer {
    private Map<String, String> messages = new HashMap<>();

    public void add(String subject, String message) {
        messages.put(subject, message);
    }

    public String get(String subject) {
        return messages.get(subject);
    }
}
