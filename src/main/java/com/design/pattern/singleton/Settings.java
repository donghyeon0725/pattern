package com.design.pattern.singleton;

import java.lang.Enum;


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
