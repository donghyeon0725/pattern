package com.design.pattern.objectAction.visitor.after2;

public class Watch implements Device {
    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print Rectangle to watch");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print Triangle to watch");
    }
}
