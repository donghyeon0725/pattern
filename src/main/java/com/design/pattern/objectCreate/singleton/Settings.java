package com.design.pattern.objectCreate.singleton;


public enum Settings {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public Settings setValue(int value) {
        this.value = value;
        return this;
    }
}
