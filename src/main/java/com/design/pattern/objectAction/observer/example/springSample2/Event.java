package com.design.pattern.objectAction.observer.example.springSample2;

/**
 * context 가 필요 없는 경우는 이렇게 만들 수도 있다.
 * */
public class Event {
    private String message;

    public Event(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
