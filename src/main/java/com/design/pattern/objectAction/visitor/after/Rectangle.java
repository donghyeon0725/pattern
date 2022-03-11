package com.design.pattern.objectAction.visitor.after;

public class Rectangle implements Shape {

    @Override
    public void accept(Phone phone) {
        System.out.println("print Rectangle to phone");
    }

    @Override
    public void accept(Watch watch) {
        System.out.println("print Rectangle to watch");
    }
}
