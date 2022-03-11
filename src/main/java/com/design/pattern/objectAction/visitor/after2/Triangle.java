package com.design.pattern.objectAction.visitor.after2;

public class Triangle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
