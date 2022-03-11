package com.design.pattern.objectAction.visitor.after;

public class Triangle implements Shape {

    @Override
    public void accept(Phone phone) {
        System.out.println("print Triangle to phone");
    }

    @Override
    public void accept(Watch watch) {
        System.out.println("print Triangle to watch");
    }
}
