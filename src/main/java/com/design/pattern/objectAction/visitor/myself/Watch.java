package com.design.pattern.objectAction.visitor.myself;


public class Watch implements Device {
    @Override
    public void print(Shape shape) {
        System.out.println("print " + shape.getClass() + " to " + this.getClass());
    }
}
