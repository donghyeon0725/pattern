package com.design.pattern.objectAction.observer.after;

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void handleMessage(String message) {
        System.out.println(this.name + " get message [" + message + "]");
    }
}
