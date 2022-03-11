package com.design.pattern.objectAction.visitor.after2;

public class Phone implements Device {
    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print Rectangle to phone");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print Triangle to phone");
    }
}
