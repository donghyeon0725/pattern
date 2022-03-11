package com.design.pattern.objectAction.visitor.myself;

public class Rectangle implements Shape {
    @Override
    public void printTo(Device device) {
        device.print(this);
    }
}
