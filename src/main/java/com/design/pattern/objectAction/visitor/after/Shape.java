package com.design.pattern.objectAction.visitor.after;

public interface Shape {
    void accept(Phone phone);
    void accept(Watch watch);
}
