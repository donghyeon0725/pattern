package com.design.pattern.objectAction.visitor.myself;


public class Triangle implements Shape {
    @Override
    public void printTo(Device device) {
        device.print(this);
    }
}
